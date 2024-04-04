package org.wby.seckill.utils;

import org.apache.commons.lang3.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 功能：校验
 */
public class ValidatorUtil {

    private static final Pattern MOBILE_PATTERN = Pattern.compile("^1[3-9]\\\\d{9}$");

    /**
     * 功能：校验是否是手机号
     * @param mobile 输入的手机号
     * @return true || false
     */
    public static Boolean isMobile(String mobile) {
        if (StringUtils.isEmpty(mobile)) {
            return false;
        }
        Matcher matcher = MOBILE_PATTERN.matcher(mobile);
        return matcher.matches();

    }
}
