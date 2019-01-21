package com.git.bean;

/**
 * @author wangquan07
 *         2019/1/21 16:54
 */
public class BaseResponse<T> {
    public static final BaseResponse SUCCESS = new BaseResponse(1, "成功");

    private Integer code;
    private String msg;
    private T data;

    public static <T> BaseResponse successData(T data) {
        return new BaseResponse<>(1, "成功", data);
    }

    public BaseResponse(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public BaseResponse(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }


}