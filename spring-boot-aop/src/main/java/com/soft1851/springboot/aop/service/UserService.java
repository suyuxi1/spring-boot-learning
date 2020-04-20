package com.soft1851.springboot.aop.service;

import com.soft1851.springboot.aop.common.Result;
import com.soft1851.springboot.aop.entity.UserDto;

/**
 * @author Su
 * @className UserService
 * @Description TODO
 * @Date 2020/4/13 19:36
 * @Version 1.0
 **/
public interface UserService {


    Result select(UserDto userDto);


}
