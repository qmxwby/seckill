package org.wby.seckill.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.wby.seckill.vo.ResultBeanEnum;

/**
 * 全局异常类
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GlobalException extends RuntimeException{
    private ResultBeanEnum resultBeanEnum;
}
