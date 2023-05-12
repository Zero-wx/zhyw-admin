package com.lumlord.zhyw;

import com.lumlord.zhyw.api.ApiApplication;
import com.lumlord.zhyw.bean.entity.system.Account;
import com.lumlord.zhyw.bean.entity.system.User;
import com.lumlord.zhyw.service.AccountService;
import com.lumlord.zhyw.service.UserService;
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
    private UserService userService;


    @Test
    public void sqlTest() {
        User user = new User();
        user.setUsername("admin");
        user.setPassword("admin");
        user.setMobilePhone("15151515151");


        userService.save(user);

        User one = userService.getOne(null);
    }
}
