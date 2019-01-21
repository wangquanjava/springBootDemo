package com.git.bean;

import lombok.Data;
import lombok.ToString;

/**
 * @author wangquan07
 * 2019/1/21 16:54
 */
@Data
@ToString
public class BaseResponse<T> {
    public static final BaseResponse SUCCESS = new BaseResponse(1, "成功");

    private Integer code;
    private String msg;
    private T data;

    public BaseResponse(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public BaseResponse(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T>  BaseResponse successData(T data) {
        return new BaseResponse<>(1, "成功", data);
    }
}