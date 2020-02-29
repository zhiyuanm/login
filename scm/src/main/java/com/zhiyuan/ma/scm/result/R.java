package com.zhiyuan.ma.scm.result;

import lombok.Data;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

@Data
public class R implements Serializable {
    private String code = "20000";
    private Rtable data = new Rtable();
    public R (){
        this.data = new Rtable();
    }
    class Rtable implements Serializable {
        String token = "admin";
        String avatar = "https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif";
        String name = "admin";
        List<String> roles = Arrays.asList("admin");
    }
}
