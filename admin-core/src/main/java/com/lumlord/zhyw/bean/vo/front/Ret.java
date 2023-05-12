package com.lumlord.zhyw.bean.vo.front;

import lombok.Data;

/**
 * Created on 2023/5/12
 *
 * @author huangwx
 * Description:
 */
@Data
public class Ret<T> {
    private Integer code;
    private String msg;
    private T data;
    private boolean success;


    public Ret(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
        this.success = Result.SUCCESS.intValue() == code.intValue();
    }

    @Override
    public String toString() {
        return "{" +
                "'code':" + code + "," +
                "'msg':" + msg + "," +
                "'success':" + success + "," +
                "}";
    }
}
