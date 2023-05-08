package com.lumlord.zhyw.api.controller;

import com.lumlord.zhyw.bean.entity.Account;
import com.lumlord.zhyw.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
    private AccountService accountService;


    @PostMapping("/login")
    public List<Account> login() {
        return accountService.list();
    }
}
