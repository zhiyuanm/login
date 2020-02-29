package com.zhiyuan.ma.scm.controller.userController;

import com.zhiyuan.ma.scm.base.ObjectResponse;
import com.zhiyuan.ma.scm.bean.user.User;
import com.zhiyuan.ma.scm.result.R;
import com.zhiyuan.ma.scm.utils.ObjectResponseSingleton;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;
//@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/login")
    @ResponseBody
    public R login(@RequestBody User user){
//        ObjectResponse objectResponse = ObjectResponseSingleton.buildObjectResponse();
//        user.setToken(UUID.randomUUID().toString());
//        objectResponse.data(user);
        R r = new R();
        return r;
    }
    @RequestMapping("/getCurrentUserInfo")
    @ResponseBody
    public R getUserInfo(@RequestBody User user){
        return new R();
    }

    @RequestMapping("/getAllUser")
    @ResponseBody
    public ObjectResponse getAllUser(){
        ObjectResponse objectResponse = new ObjectResponse();
        User user = new User();
        user.setUsername("123456");
        objectResponse.setData(user);
        return objectResponse;
    }
}
