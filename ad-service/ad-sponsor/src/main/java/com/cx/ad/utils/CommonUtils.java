package com.cx.ad.utils;

import com.cx.ad.exception.AdException;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang.time.DateUtils;
import org.bouncycastle.jcajce.provider.digest.MD5;

import java.util.Date;

/**
 * 获取token
 * @description:
 * @author: ChenXi
 * @time: 2021/1/21 9:27
 */
public class CommonUtils {
        private static String[] value={
                "yyyy-MM-dd","yyyy/MM/dd","yyyy.MM.dd"
        };

    public static String md5(String value)
    {
        return DigestUtils.md5Hex(value).toUpperCase();
    }

    /**
     * 实现字符串转换为Date
     * @param dateString
     * @return
     * @throws AdException
     */
    public static Date parseStringDate(String dateString)throws AdException {
        try {
            return DateUtils.parseDate(dateString,value);
        }catch (Exception e)
        {
            throw new AdException(e.getMessage());
        }
    }
}
