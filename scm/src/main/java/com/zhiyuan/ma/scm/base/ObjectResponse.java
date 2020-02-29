package com.zhiyuan.ma.scm.base;

public class ObjectResponse<T> extends BaseResponse{
    private T data;

    public ObjectResponse<T> data(T data){
        this.data = data;
        return this;
    }
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
