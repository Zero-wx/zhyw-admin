package com.lumlord.zhyw.api.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lumlord.zhyw.bean.entity.system.Account;
import com.lumlord.zhyw.bean.entity.system.User;
import com.lumlord.zhyw.bean.vo.front.Result;
import com.lumlord.zhyw.service.AccountService;
import com.lumlord.zhyw.service.UserService;
import org.apache.shiro.web.filter.mgt.DefaultFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.apache.shiro.web.filter.mgt.DefaultFilter.user;

/**
 * Created on 2023/5/8
 *
 * @author huangwx
 * Description:
 */
@RestController
@RequestMapping("/account")
public class AccountController {


    @Autowired
    private UserService userService;


    @PostMapping("/login")
    public Object login(@RequestBody Account params) {
//        QueryWrapper<Account> wrapper = new QueryWrapper<>();
//        wrapper.eq("username", params.getUsername());
//        Account user = accountService.getOne(wrapper);
//        if (user == null) return Result.failure("用户不存在");






        return Result.success(list);

    }
}
