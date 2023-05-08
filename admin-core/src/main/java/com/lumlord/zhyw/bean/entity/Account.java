package com.lumlord.zhyw.bean.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * Created on 2023/5/8
 *
 * @author huangwx
 * Description:
 */
@Data
@TableName("account")
public class Account {
    private Integer id;
    private String username;
    private String password;
}
