package org.wby.seckill.vo;



import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import org.wby.seckill.validator.IsMobile;

@Data
@Getter
@Setter
public class LoginVo {

    @IsMobile
    @NotNull(message = "账号不能为null")
    private String mobile;

    @NotNull(message = "密码不能为null")
    private String password;
}
