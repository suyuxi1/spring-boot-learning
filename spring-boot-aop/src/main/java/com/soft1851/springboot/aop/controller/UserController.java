package com.soft1851.springboot.aop.controller;

import com.soft1851.springboot.aop.annotation.AuthToken;
import com.soft1851.springboot.aop.common.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author su
 * @className UserController
 * @Description TODO
 * @Date 2020/4/13 15:21
 * @Version 1.0
 **/
@RestController
@Slf4j
public class UserController {

    /**
     * 无需任何校验不用加注解
     *
     * @param name
     * @return
     */
    @GetMapping("hello")
    public Result hello(String name) {
        log.info("hello()方法无需鉴权无需认证,当前用户名" + name);
        return Result.success("hello方法访问成功");
//        return "hello方法访问成功";
    }

    /**
     * 需要登录认证,需要加注解，不用传角色
     *
     * @param name
     * @return
     */
    @GetMapping("user")
    @AuthToken
    public Result user(String name) {
        log.info("user()方法需要认证，当前用户名"+name);
//        return "user()方法访问成功";
        return Result.success("user()方法访问成功");
    }


    /**
     * 需要鉴权，加注解，加角色
     * @param name
     * @return
     */
    @GetMapping("admin")
    @AuthToken(role_name = {"0","superAdmin"})
    public Result admin(String name){
        log.info("admin()方法需要鉴权,当前用户名"+name);
        return Result.success("admin()方法访问成功");
//        return "admin()方法访问成功";
    }



}
