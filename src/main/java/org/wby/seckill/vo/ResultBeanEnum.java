package org.wby.seckill.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 枚举返回类型
 */
@Getter
@AllArgsConstructor
@ToString
public enum ResultBeanEnum {
    // 通用返回类型
    SUCCESS(200, "请求成功"),
    ERROR(500, "服务端异常"),

    // 登录功能
    LOGIN_ERROR(500210, "账号或密码不正确"),
    MOBILE_ERROR(500211, "手机号格式不正确");

    private final Integer code;
    private final String message;



}
