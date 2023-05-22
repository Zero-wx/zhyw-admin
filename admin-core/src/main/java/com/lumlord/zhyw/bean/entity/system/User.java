package com.lumlord.zhyw.bean.entity.system;

import com.baomidou.mybatisplus.annotation.*;
import com.lumlord.zhyw.bean.entity.BaseEntity;
import lombok.Data;

import java.util.Date;

/**
 * Created on 2023/5/10
 *
 * @author huangwx
 * Description:
 */
@Data
@TableName("t_user")
public class User extends BaseEntity{

//    private Date createTime;

    private Integer createBy;

//    private Date modifyTime;

    private Integer modifyBy;


    private String username;//varchar(50) DEFAULT NULL COMMENT '用户名',
    private String password;//varchar(100) DEFAULT NULL COMMENT '登录密码',
    private String mobilePhone;//varchar(15) NOT NULL COMMENT '用户手机号',
    private String status;//int(11) DEFAULT '0' COMMENT '禁用状态（1禁用，0未禁用/默认）',
    private String skinColor;//varchar(100) DEFAULT NULL COMMENT '系统肤色',
    private String redisToken;//varchar(255) DEFAULT NULL COMMENT 'redisToken 值。',
    private String lastLoginCompany;// int(11) DEFAULT NULL COMMENT '最后登录企业',
    private String lastLoginTime;// datetime DEFAULT NULL COMMENT '最后登录时间',
    private String loginTotals;// int(11) DEFAULT NULL COMMENT '登录次数 默认是 0 ',
    private String ip;// varchar(255) DEFAULT NULL COMMENT '登录IP',
    private String loginSource;// int(11) DEFAULT NULL COMMENT '登录来源  0 PC 1 APP',
    private String idNumber;// varchar(30) DEFAULT NULL COMMENT '身份证号码',
    private String headAddress;// varchar(255) DEFAULT NULL COMMENT '用户头像',
    private String isRealName;// int(2) DEFAULT '0' COMMENT '是否实名认证 0 不是 1 是',
    private String joinCheckState;// int(11) DEFAULT '0' COMMENT '加入状态  0 待审核 1审核通过2审核退回 ',
    private String contactNum;// varchar(255) DEFAULT NULL COMMENT '紧急联系人电话',
    private String contactUser;//varchar(255) DEFAULT NULL COMMENT '紧急联系人',
    private String idCardType;// int(1) DEFAULT '1' COMMENT '证件类型（中国居民身份证1   护照2    港澳通行证3）',
    private String idCardBefore;// varchar(100) DEFAULT NULL COMMENT '身份证正面',
    private String idCardBack;// varchar(100) DEFAULT NULL COMMENT '身份证背面',
    private String state;//int(1) DEFAULT '0' COMMENT '删除状态（1已删除；0未删除/默认）',
}
