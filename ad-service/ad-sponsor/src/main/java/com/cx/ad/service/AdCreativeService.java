package com.cx.ad.service;

import com.cx.ad.exception.AdException;
import com.cx.ad.vo.CreativeRequest;
import com.cx.ad.vo.CreativeResponse;

/**
 * @author xi.chen
 */
public interface AdCreativeService {
    /**
     *
     * @param request
     * @return
     */
    CreativeResponse createCreative(CreativeRequest request) throws AdException;
}
