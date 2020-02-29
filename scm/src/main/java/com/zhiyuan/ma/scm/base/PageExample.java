package com.zhiyuan.ma.scm.base;

import tk.mybatis.mapper.entity.Example;

public class PageExample<T> extends Example {
    protected T data;
    public PageExample(Class<?> entityClass,T data) {
        super(entityClass);
        this.data = data;
    }

    public PageExample(Class<?> entityClass, boolean exists,T data) {
        super(entityClass, exists);
        this.data = data;
    }

    public PageExample(Class<?> entityClass, boolean exists, boolean notNull,T data) {
        super(entityClass, exists, notNull);
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
