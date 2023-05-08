package com.lumlord.zhyw;

import com.lumlord.zhyw.api.ApiApplication;
import com.lumlord.zhyw.bean.entity.Account;
import com.lumlord.zhyw.service.AccountService;
import com.lumlord.zhyw.service.Impl.AccountServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.util.List;

/**
 * Created on 2023/5/8
 *
 * @author huangwx
 * Description:
 */
@SpringBootTest(classes = ApiApplication.class)
@TestPropertySource(locations = {"classpath:application.yml"})
public class ApiApplicationTest {

    @Autowired
    private AccountService accountService;


    @Test
    public void sqlTest() {
        System.out.println("数据库连接测试");

        List<Account> list = accountService.list();

        System.out.println(list);
    }
}
