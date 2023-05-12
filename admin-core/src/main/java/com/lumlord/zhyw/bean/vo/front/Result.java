package com.lumlord.zhyw.bean.vo.front;

import lombok.Data;

/**
 * Created on 2023/5/11
 *
 * @author huangwx
 * Description:
 */

public class Result {

    public static final Integer SUCCESS = 20000;
    public static final Integer FAILURE = 9999;
    public static final Integer TOKEN_EXPIRE = 50014;

    public static Ret success(Object data) {
        return new Ret<>(Result.SUCCESS, "成功", data);
    }

    public static Ret success() {
        return new Ret<>(Result.SUCCESS, "成功", null);
    }

    public static Ret failure(String msg) {
        return new Ret<>(Result.FAILURE, msg, null);
    }

    public static Ret expire() {
        return new Ret<>(Result.TOKEN_EXPIRE, "Token 过期", null);
    }

}
