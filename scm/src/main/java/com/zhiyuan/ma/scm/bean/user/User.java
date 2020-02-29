package com.zhiyuan.ma.scm.bean.user;

import lombok.Data;

import java.util.Date;
@Data
public class User {
//     implements UserDetails
    private Integer id;
    private String username;
    private String realname;
    private String password;
    private Date createDate;
    private Date lastLoginTime;
    private boolean enabled;
    private boolean accountNonExpired;
    private boolean accountNonLocked;
    private boolean credentialsNonExpired;
    private String token;
    // 用户所有权限
//    private List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
//
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//
//        return authorities;
//    }
}
