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
    SUCCESS(200, "请求成功"),
    ERROR(500, "服务端异常");

    private final Integer code;
    private final String message;



}
