package org.wby.seckill.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.ResultSet;

/**
 * 通用返回对象
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultBean {

    private Integer code;   // 状态码
    private String message; // 消息
    private Object obj;     // 数据

    public static ResultBean success() {
        return new ResultBean(ResultBeanEnum.SUCCESS.getCode(),
                ResultBeanEnum.SUCCESS.getMessage(), null);
    }

    public static ResultBean success(Object obj) {
        return new ResultBean(ResultBeanEnum.SUCCESS.getCode(),
                ResultBeanEnum.SUCCESS.getMessage(), obj);
    }

    public static ResultBean fail(ResultBeanEnum resultBeanEnum) {
        return new ResultBean(resultBeanEnum.getCode(), resultBeanEnum.getMessage(), null);
    }

    public static ResultBean fail(ResultBeanEnum resultBeanEnum, Object obj) {
        return new ResultBean(resultBeanEnum.getCode(), resultBeanEnum.getMessage(), obj);
    }

}
