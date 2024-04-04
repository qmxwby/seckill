package org.wby.seckill.service;

import org.wby.seckill.pojo.User;
import com.baomidou.mybatisplus.extension.service.IService;
import org.wby.seckill.vo.LoginVo;
import org.wby.seckill.vo.ResultBean;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wby
 * @since 2024-04-03
 */
public interface IUserService extends IService<User> {

    ResultBean doLogin(LoginVo loginvo);
}
