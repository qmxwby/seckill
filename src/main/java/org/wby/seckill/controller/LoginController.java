package org.wby.seckill.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.wby.seckill.service.IUserService;
import org.wby.seckill.vo.LoginVo;
import org.wby.seckill.vo.ResultBean;

/**
 * 登录页面跳转
 */
@Tag(name="登录模块")
@Controller
@RequestMapping("/login")
@Slf4j
public class LoginController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/toLogin")
    public String toLogin(Model model) {
        return "login";
    }

    @Operation(summary = "用户登录")
    @PostMapping("/doLogin")
    @ResponseBody
    public ResultBean doLogin(@Valid @RequestBody LoginVo loginvo) {
        log.info(loginvo.toString());
        return userService.doLogin(loginvo);
    }

}
