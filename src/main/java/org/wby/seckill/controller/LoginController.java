package org.wby.seckill.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.util.StringUtils;
import org.wby.seckill.pojo.User;
import org.wby.seckill.service.IUserService;
import org.wby.seckill.utils.MD5Util;
import org.wby.seckill.utils.ValidatorUtil;
import org.wby.seckill.vo.LoginVo;
import org.wby.seckill.vo.ResultBean;
import org.wby.seckill.vo.ResultBeanEnum;

/**
 * 登录页面跳转
 */
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

    @RequestMapping("/doLogin")
    public ResultBean doLogin(LoginVo loginvo) {
        return userService.doLogin(loginvo);
    }

}
