package com.cx.ad.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cx.ad.constant.CommonStatus;
import com.cx.ad.constant.Constants;
import com.cx.ad.dao.AdUserMapper;
import com.cx.ad.entity.AdPlan;
import com.cx.ad.dao.AdPlanMapper;
import com.cx.ad.entity.AdUser;
import com.cx.ad.exception.AdException;
import com.cx.ad.service.AdPlanService;
import com.cx.ad.utils.CommonUtils;
import com.cx.ad.vo.AdPlanGetRequest;
import com.cx.ad.vo.AdPlanRequest;
import com.cx.ad.vo.AdPlanResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * 推广计划表(AdPlan)表服务实现类
 *
 * @author makejava
 * @since 2021-01-20 15:07:52
 */
@AllArgsConstructor
@Service("adPlanService")
public class AdPlanServiceImpl extends ServiceImpl<AdPlanMapper,AdPlan> implements AdPlanService {

    private AdPlanMapper adPlanMapper;
    private AdUserMapper adUserMapper;

    /**
     * 创建一个推广计划
     * @param request
     * @return
     * @throws AdException
     */
    @Override
    public AdPlanResponse createAdPlan(AdPlanRequest request) throws AdException {
            if (!request.createValidate()){
                throw new AdException(Constants.ErrorMsg.REQUEST_PARAM_ERROR);
            }
            //确保关联的user是存在的
        Optional<AdUser> adUser= Optional.ofNullable(adUserMapper.selectById(request.getId()));
            if (!adUser.isPresent()){
                throw new AdException(Constants.ErrorMsg.CAN_NOT_FIND_RECORD);
            }
        AdPlan adPlan = adPlanMapper.findByUserAndPlanName(request.getUserId(), request.getPlanName());
            if (Objects.isNull(adPlan)){
                throw new AdException(Constants.ErrorMsg.SAME_NAME_PLAN_ERROR);
            }
            AdPlan newAdPlan=new AdPlan(request.getUserId(),request.getPlanName(), CommonUtils.parseStringDate(request.getStartDate()),CommonUtils.parseStringDate(request.getEndDate()));
        int count = adPlanMapper.insert(newAdPlan);
            if (count!=1){
                throw new AdException("创建推广计划失败");
            }
        return new AdPlanResponse(newAdPlan.getId(),newAdPlan.getPlanName());
    }

    /**
     * 根据ids和userId查找计划表
     * @param request
     * @return
     * @throws AdException
     */
    @Override
    public List<AdPlan> getAdPlanByIds(AdPlanGetRequest request) throws AdException {
        if (!request.validate()){
            throw new AdException(Constants.ErrorMsg.REQUEST_PARAM_ERROR);
        }
        return adPlanMapper.findByIdsAndUserId(request.getIds(),request.getUserId());
    }

    /**
     * 更新计划表
     * @param request
     * @return
     * @throws AdException
     */
    @Override
    @Transactional
    public AdPlanResponse updateAdPlan(AdPlanRequest request) throws AdException {
        if (!request.updateValidate()){
            throw new AdException(Constants.ErrorMsg.REQUEST_PARAM_ERROR);
        }
        AdPlan adPlan = adPlanMapper.findByIdAndUserId(request.getId(), request.getUserId());
        if (Objects.isNull(adPlan)){
            throw new AdException(Constants.ErrorMsg.CAN_NOT_FIND_RECORD);
        }
        if (request.getPlanName() != null) {
            adPlan.setPlanName(request.getPlanName());
        }
        if (request.getStartDate() != null) {
            adPlan.setStartDate(
                    CommonUtils.parseStringDate(request.getStartDate())
            );
        }
        if (request.getEndDate() != null) {
            adPlan.setEndDate(
                    CommonUtils.parseStringDate(request.getEndDate())
            );
        }
        adPlan.setUpdateTime(new Date());

        int update = adPlanMapper.update(adPlan, null);

        return new AdPlanResponse(adPlan.getId(),adPlan.getPlanName());
    }

    /**
     *删除
     * @param request
     * @return
     * @throws AdException
     */
    @Override
    @Transactional
    public void deleteAdPlan(AdPlanRequest request) throws AdException {
        if (!request.deleteValidate()){
            throw new AdException(Constants.ErrorMsg.REQUEST_PARAM_ERROR);
        }
        AdPlan adPlan = adPlanMapper.findByIdAndUserId(request.getId(), request.getUserId());
        if (Objects.isNull(adPlan)){
            throw new AdException(Constants.ErrorMsg.CAN_NOT_FIND_RECORD);
        }
        adPlan.setPlanStatus(CommonStatus.INVALID.getStatus());
        adPlan.setUpdateTime(new Date());
        adPlanMapper.updateById(adPlan);
    }

    @Override
    public AdPlan selectById(Long id) {
      return   adPlanMapper.findById(id);
    }
}