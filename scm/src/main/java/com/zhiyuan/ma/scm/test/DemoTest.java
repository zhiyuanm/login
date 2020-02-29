package com.zhiyuan.ma.scm.test;

import com.zhiyuan.ma.scm.bean.dict.DictType;

import java.lang.reflect.Field;
import java.time.LocalDateTime;

public class DemoTest {
    public static void main(String[] args) throws IllegalAccessException {
        DictType dictType = new DictType();
        Class<? extends DictType> clazz = dictType.getClass();
        Class<?> superclass = clazz.getSuperclass();
        Field[] declaredFields = superclass.getDeclaredFields();
        Field.setAccessible(declaredFields, true);
        for (Field x : declaredFields) {
            System.out.println(x.getName());
            if("crtTime".equals(x.getName())) {
                x.set(dictType,LocalDateTime.now());
            }
        }
        System.out.println(dictType.getCrtTime());
    }
}
