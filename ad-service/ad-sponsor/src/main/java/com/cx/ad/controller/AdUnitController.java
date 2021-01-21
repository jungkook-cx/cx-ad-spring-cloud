package com.cx.ad.controller;

import com.cx.ad.constant.Constants;
import com.cx.ad.entity.AdUnit;
import com.cx.ad.entity.unit_condition.AdUnitKeyword;
import com.cx.ad.exception.AdException;
import com.cx.ad.service.AdUnitKeywordService;
import com.cx.ad.service.AdUnitService;
import com.cx.ad.vo.AdUnitKeywordRequest;
import com.cx.ad.vo.AdUnitKeywordResponse;
import com.cx.ad.vo.AdUnitResponse;
import com.cx.ad.vo.R;
import lombok.AllArgsConstructor;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 推广单元表(AdUnit)表控制层
 *
 * @author makejava
 * @since 2021-01-20 15:23:42
 */
@RestController
@AllArgsConstructor
@RequestMapping("adUnit")
public class AdUnitController {

}