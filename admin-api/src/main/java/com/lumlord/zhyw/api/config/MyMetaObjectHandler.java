package com.lumlord.zhyw.api.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import com.lumlord.zhyw.security.JwtUtil;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created on 2023/5/12
 *
 * @author huangwx
 * Description:
 */
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {





    @Override
    public void insertFill(MetaObject metaObject) {



        Integer userId = JwtUtil.getUserId();
        if (userId==null) userId = null;


        this.setFieldValByName("createTime", new Date(), metaObject);
//        this.setFieldValByName("createBy", JwtUtil.getUserId(), metaObject);
        this.setFieldValByName("modifyTime", new Date(), metaObject);
//        this.setFieldValByName("modifyBy", JwtUtil.getUserId(), metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        this.setFieldValByName("modifyTime", new Date(), metaObject);
        this.setFieldValByName("modifyBy", JwtUtil.getUserId(), metaObject);
    }
}
