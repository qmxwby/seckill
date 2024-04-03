package org.wby.seckill.service.impl;

import org.wby.seckill.pojo.User;
import org.wby.seckill.mapper.UserMapper;
import org.wby.seckill.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

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

}
