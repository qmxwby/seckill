package org.wby.seckill.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.thymeleaf.util.StringUtils;
import org.wby.seckill.utils.ValidatorUtil;

public class IsMobileValidator implements ConstraintValidator<IsMobile, String> {

    private boolean required = false;
    @Override
    public void initialize(IsMobile constraintAnnotation) {
        required = constraintAnnotation.required();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if (required) {
            return ValidatorUtil.isMobile(s);
        } else {
            if (StringUtils.isEmpty(s)) return true;
            else return ValidatorUtil.isMobile(s);
        }
    }
}
