package com.cx.ad.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cx.ad.constant.Constants;
import com.cx.ad.dao.AdCreativeMapper;
import com.cx.ad.entity.AdCreative;
import com.cx.ad.exception.AdException;
import com.cx.ad.service.AdCreativeService;
import com.cx.ad.vo.CreativeRequest;
import com.cx.ad.vo.CreativeResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @description:
 * @author: ChenXi
 * @time: 2021/1/21 16:32
 */
@Service
@AllArgsConstructor
public class AdCreativeServiceImpl extends ServiceImpl<AdCreativeMapper, AdCreative> implements AdCreativeService  {
    private AdCreativeMapper creativeMapper;

    /**
     * 增加
     * @param request
     * @return
     * @throws AdException
     */
    @Override
    public CreativeResponse createCreative(CreativeRequest request) throws AdException {
        AdCreative creative = request.convertToEntity();
        if (Objects.isNull(creative)){
            throw new AdException(Constants.ErrorMsg.REQUEST_PARAM_ERROR);
        }
        int count = creativeMapper.insert(creative);

        return new CreativeResponse(creative.getId(), creative.getName());
    }
}
