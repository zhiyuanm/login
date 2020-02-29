package com.zhiyuan.ma.scm.utils;

import com.zhiyuan.ma.scm.base.ObjectResponse;

public class ObjectResponseSingleton {
    private ObjectResponseSingleton(){}
    private static volatile ObjectResponse objectResponse = null;
    public static ObjectResponse buildObjectResponse(){
        if(objectResponse == null) {
            synchronized (ObjectResponseSingleton.class){
                if(objectResponse == null) {
                    objectResponse = new ObjectResponse();
                }
            }
        }
        return objectResponse;
    }
}
