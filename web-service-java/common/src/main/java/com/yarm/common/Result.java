package com.yarm.common;
/**
 * @Description :统一返回
 * @Author : yarm.yang
 * @Date : 2020/3/18 14:31
*/
public class Result<T> {
    private int code;
    private String msg;
    private boolean status = true;
    private T data;

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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Result(){
        this.status = true;
    }
    public Result(String msg){
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", status=" + status +
                ", data=" + data +
                '}';
    }
}
