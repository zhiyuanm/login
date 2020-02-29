package com.zhiyuan.ma.scm.utils;

import java.lang.reflect.Field;
import java.time.LocalDateTime;

public class SetInfoFields {
    public static <T> void  setCreateFiled(T t){
        try{
            Class<?> clazz = t.getClass();
            Class<?> superclass = clazz.getSuperclass();
            Field[] declaredFields = superclass.getDeclaredFields();
            Field.setAccessible(declaredFields, true);
            for (Field filed : declaredFields) {
                if("crtTime".equals(filed.getName())) {
                    filed.set(t, LocalDateTime.now());
                }
                if("updTime".equals(filed.getName())) {
                    filed.set(t, LocalDateTime.now());
                }
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    public static <T> void  setUpdFiled(T t){
        try{
            Class<?> clazz = t.getClass();
            Class<?> superclass = clazz.getSuperclass();
            Field[] declaredFields = superclass.getDeclaredFields();
            for (Field filed : declaredFields) {
                if("upd_time".equals(filed.getName())) {
                    filed.set(t, LocalDateTime.now());
                }
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
