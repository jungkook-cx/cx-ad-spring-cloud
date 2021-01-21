package com.cx.ad.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cx.ad.constant.Constants;
import com.cx.ad.dao.AdCreativeMapper;
import com.cx.ad.dao.AdPlanMapper;
import com.cx.ad.dao.unit_condition.AdUnitDistrictMapper;
import com.cx.ad.dao.unit_condition.AdUnitItMapper;
import com.cx.ad.dao.unit_condition.AdUnitKeywordMapper;
import com.cx.ad.entity.AdPlan;
import com.cx.ad.entity.AdUnit;
import com.cx.ad.dao.AdUnitMapper;
import com.cx.ad.entity.unit_condition.AdUnitDistrict;
import com.cx.ad.entity.unit_condition.AdUnitIt;
import com.cx.ad.entity.unit_condition.AdUnitKeyword;
import com.cx.ad.entity.unit_condition.CreativeUnit;
import com.cx.ad.exception.AdException;
import com.cx.ad.service.AdUnitService;
import com.cx.ad.vo.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.*;
import java.util.stream.Collectors;


/**
 * 推广单元表(AdUnit)表服务实现类
 *
 * @author makejava
 * @since 2021-01-20 15:23:42
 */
@Service("adUnitService")
@AllArgsConstructor
public class AdUnitServiceImpl extends ServiceImpl<AdUnitMapper,AdUnit> implements AdUnitService {
    private AdPlanMapper planMapper;
    private AdUnitMapper unitMapper;
    private AdUnitKeywordMapper unitKeywordMapper;
    private AdUnitDistrictMapper unitDistrictMapper;
    private AdUnitItMapper unitItMapper;
    private AdCreativeMapper creativeMapper;
    /**
     * 创建推广单元
     * @param request
     * @return
     * @throws AdException
     */
    @Override
    public AdUnitResponse createUnit(AdUnitRequest request) throws AdException {
        if (!request.createValidate()){
            throw new AdException(Constants.ErrorMsg.REQUEST_PARAM_ERROR);
        }
        Optional<AdPlan> plan = Optional.ofNullable(planMapper.selectById(request.getPlanId()));
        if (!plan.isPresent()) {
            throw new AdException(Constants.ErrorMsg.CAN_NOT_FIND_RECORD);
        }

        AdUnit oldAdUnit = unitMapper.findByPlanIdAndUnitName(
                request.getPlanId(), request.getUnitName()
        );
        if (oldAdUnit != null) {
            throw new AdException(Constants.ErrorMsg.SAME_NAME_UNIT_ERROR);
        }

        AdUnit unit = new AdUnit(request.getPlanId(), request.getUnitName(),
                request.getPositionType(), request.getBudget());
        int count = unitMapper.insert(unit);
        if (count!=1){
            throw new AdException("创建失败");
        }
        return new AdUnitResponse(unit.getId(), unit.getUnitName());
    }

    @Override
    public AdUnitKeywordResponse createUnitKeyword(AdUnitKeywordRequest request) throws AdException {

      /*  List<Long> unitIds = request.getUnitKeywords().stream()
                .map(AdUnitKeywordRequest.UnitKeyword::getUnitId)
                .collect(Collectors.toList());
        if (!isRelatedUnitExist(unitIds)) {
            throw new AdException(Constants.ErrorMsg.REQUEST_PARAM_ERROR);
        }

        List<Long> ids = Collections.emptyList();

        List<AdUnitKeyword> unitKeywords = new ArrayList<>();
        if (!CollectionUtils.isEmpty(request.getUnitKeywords())) {

            request.getUnitKeywords().forEach(i -> unitKeywords.add(
                    new AdUnitKeyword(i.getUnitId(), i.getKeyword())
            ));
            ids = unitKeywordMapper.insert(unitKeywords).stream()
                    .map(AdUnitKeyword::getId)
                    .collect(Collectors.toList());
        }

        return new AdUnitKeywordResponse(ids);*/
        return null;
    }

    @Override
    public AdUnitItResponse createUnitIt(AdUnitItRequest request) throws AdException {
       /* List<Long> unitIds = request.getUnitIts().stream()
                .map(AdUnitItRequest.UnitIt::getUnitId)
                .collect(Collectors.toList());
        if (!isRelatedUnitExist(unitIds)) {
            throw new AdException(Constants.ErrorMsg.REQUEST_PARAM_ERROR);
        }

        List<AdUnitIt> unitIts = new ArrayList<>();
        request.getUnitIts().forEach(i -> unitIts.add(
                new AdUnitIt(i.getUnitId(), i.getItTag())
        ));

        List<Long> ids = unitItMapper.saveAll(unitIts).stream()
                .map(AdUnitIt::getId)
                .collect(Collectors.toList());

        return new AdUnitItResponse(ids);*/
        return null;
    }

    @Override
    public AdUnitDistrictResponse createUnitDistrict(AdUnitDistrictRequest request) throws AdException {
        /*List<Long> unitIds = request.getUnitDistricts().stream()
                .map(AdUnitDistrictRequest.UnitDistrict::getUnitId)
                .collect(Collectors.toList());
        if (!isRelatedUnitExist(unitIds)) {
            throw new AdException(Constants.ErrorMsg.REQUEST_PARAM_ERROR);
        }

        List<AdUnitDistrict> unitDistricts = new ArrayList<>();
        request.getUnitDistricts().forEach(d -> unitDistricts.add(
                new AdUnitDistrict(d.getUnitId(), d.getProvince(),
                        d.getCity())
        ));
        List<Long> ids = unitDistrictMapper.saveAll(unitDistricts)
                .stream().map(AdUnitDistrict::getId)
                .collect(Collectors.toList());

        return new AdUnitDistrictResponse(ids);*/
        return null;
    }

    @Override
    public CreativeUnitResponse createCreativeUnit(CreativeUnitRequest request) throws AdException {
      /*  List<Long> unitIds = request.getUnitItems().stream()
                .map(CreativeUnitRequest.CreativeUnitItem::getUnitId)
                .collect(Collectors.toList());
        List<Long> creativeIds = request.getUnitItems().stream()
                .map(CreativeUnitRequest.CreativeUnitItem::getCreativeId)
                .collect(Collectors.toList());

        if (!(isRelatedUnitExist(unitIds) && isRelatedUnitExist(creativeIds))) {
            throw new AdException(Constants.ErrorMsg.REQUEST_PARAM_ERROR);
        }

        List<CreativeUnit> creativeUnits = new ArrayList<>();
        request.getUnitItems().forEach(i -> creativeUnits.add(
                new CreativeUnit(i.getCreativeId(), i.getUnitId())
        ));

        List<Long> ids = creativeMapper.insert(creativeUnits)
                .stream()
                .map(CreativeUnit::getId)
                .collect(Collectors.toList());

        return new CreativeUnitResponse(ids);*/
        return null;
    }

    private boolean isRelatedUnitExist(List<Long> unitIds) {

        if (CollectionUtils.isEmpty(unitIds)) {
            return false;
        }

        return creativeMapper.selectBatchIds(unitIds).size() ==
                new HashSet<>(unitIds).size();
    }

    private boolean isRelatedCreativeExist(List<Long> creativeIds) {

        if (CollectionUtils.isEmpty(creativeIds)) {
            return false;
        }

        return creativeMapper.selectBatchIds(creativeIds).size() ==
                new HashSet<>(creativeIds).size();
    }
}