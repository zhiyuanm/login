package com.zhiyuan.ma.scm.conf;

import tk.mybatis.mapper.genid.GenId;

import java.util.UUID;

public class UUIdGenId implements GenId<String> {
    @Override
    public String genId(String s, String s1) {
//        return UUID.randomUUID().toString().replace("-","");
        return UUID.randomUUID().toString();
    }
}
