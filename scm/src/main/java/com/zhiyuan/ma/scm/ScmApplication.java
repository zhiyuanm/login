package com.zhiyuan.ma.scm;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan("com.zhiyuan.ma.scm.mapper")
@SpringBootApplication
public class ScmApplication {
    public static void main(String[] args) {
        SpringApplication.run(ScmApplication.class,args);
    }
}
