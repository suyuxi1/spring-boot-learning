package com.soft1851.springboot.aop.service;

import java.util.Map;

/**
 * @author Su
 * @className SysUserService
 * @Description TODO
 * @Date 2020/4/14 9:54
 * @Version 1.0
 **/
public interface SysUserService {
    /**
     * 用户登录
     * @param id
     * @param password
     * @return
     */
    Map<String,Object> signIn(String id, String password);
}
