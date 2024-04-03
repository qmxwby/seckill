package org.wby.seckill.utils;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Component;

@Component
public class MD5Util {

    // 和前端统一的salt
    private static final String SALT = "1a2b3c4d";
    public static String md5(String src) {
        return DigestUtils.md5Hex(src);
    }

    /**
     * 加密明文
     * @param inputPass
     * @return
     */
    public static String inputPassToFormPass(String inputPass) {
        String src = SALT.charAt(0) + SALT.charAt(2)
                + inputPass + SALT.charAt(1) + SALT.charAt(3);
        return md5(src);
    }

    public static String formPassToDBPass(String formPass, String salt) {
        String pass = salt.charAt(0) + salt.charAt(2)
                + formPass + salt.charAt(1) + salt.charAt(3);
        return md5(pass);
    }

}
