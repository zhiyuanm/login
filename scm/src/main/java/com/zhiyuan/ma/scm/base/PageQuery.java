package com.zhiyuan.ma.scm.base;

import java.util.Map;

public class PageQuery<T> extends Query{
    protected T data;
    public PageQuery(Map<String,Object> params,T data){
        super(params);
        this.data = data;
    }
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
