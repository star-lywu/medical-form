package com.starylwu.medicalform.dto;

/**
 * @Auther: Wuyulong
 * @Date: 2018/10/28 13:38
 * @Description:
 */
public class Result<T> {

    private int code;

    private String msg;

    private T data;

    public Result(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Result() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
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

    public static <T> Result<T> success(T data){
        return new Result<T>(200, "OK", data);
    }
}
