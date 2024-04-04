package org.wby.seckill.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.thymeleaf.util.StringUtils;
import org.wby.seckill.pojo.User;
import org.wby.seckill.mapper.UserMapper;
import org.wby.seckill.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.wby.seckill.utils.MD5Util;
import org.wby.seckill.utils.ValidatorUtil;
import org.wby.seckill.vo.LoginVo;
import org.wby.seckill.vo.ResultBean;
import org.wby.seckill.vo.ResultBeanEnum;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wby
 * @since 2024-04-03
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public ResultBean doLogin(LoginVo loginvo) {
        String mobile = loginvo.getMobile();
        String password = loginvo.getPassword();
        if(StringUtils.isEmpty(mobile) ||
                StringUtils.isEmpty(password)) {
            return ResultBean.fail(ResultBeanEnum.LOGIN_ERROR);
        }
        if(!ValidatorUtil.isMobile(mobile)) {
            return ResultBean.fail(ResultBeanEnum.MOBILE_ERROR);
        }
        // 根据手机号获取用户
        User user = userMapper.selectById(mobile);
        if (user == null) return ResultBean.fail(ResultBeanEnum.LOGIN_ERROR);
        if (!MD5Util.formPassToDBPass(password, user.getSlat()).equals(user.getPassword())) {
            return ResultBean.fail(ResultBeanEnum.LOGIN_ERROR);
        }
        return ResultBean.success();
    }
}
