package com.lumlord.zhyw.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lumlord.zhyw.bean.entity.system.User;
import com.lumlord.zhyw.mappers.UserMapper;
import com.lumlord.zhyw.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Created on 2023/5/12
 *
 * @author huangwx
 * Description:
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
