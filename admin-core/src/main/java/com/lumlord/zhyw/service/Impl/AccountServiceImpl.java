package com.lumlord.zhyw.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lumlord.zhyw.bean.entity.system.Account;
import com.lumlord.zhyw.mappers.AccountMapper;
import com.lumlord.zhyw.service.AccountService;
import org.springframework.stereotype.Service;

/**
 * Created on 2023/5/8
 *
 * @author huangwx
 * Description:
 */
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements AccountService {
}
