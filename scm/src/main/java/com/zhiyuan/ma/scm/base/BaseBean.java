package com.zhiyuan.ma.scm.base;

import lombok.Data;

import javax.persistence.Column;
import java.time.LocalDateTime;

@Data
public class BaseBean {
    @Column(name = "crt_time")
    private LocalDateTime crtTime;
    @Column(name = "crt_user")
    private String crtUser;
    private LocalDateTime updTime;
    @Column(name = "upd_user")
    private String updUser;
    @Column(name = "upd_user_id")
    private String updUserId;
}
