package com.soft1851.springboot.aop.service.impl;

import com.soft1851.springboot.aop.common.Result;
import com.soft1851.springboot.aop.common.ResultCode;
import com.soft1851.springboot.aop.entity.User;
import com.soft1851.springboot.aop.entity.UserDto;
import com.soft1851.springboot.aop.mapper.UserMapper;
import com.soft1851.springboot.aop.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author su
 * @className UserServiceImpl
 * @Description TODO
 * @Date 2020/4/13 19:37
 * @Version 1.0
 **/
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public Result select(UserDto userDto) {
        User user = userMapper.selectByPhone(userDto);
        if (user != null){
            if (userDto.getPassword() != null){
                if (userDto.getPassword().equals(user.getPassword())){
                    return Result.success(user);
                }else {
                    return Result.failure(ResultCode.USER_PASSWORD_ERROR);
                }
            }else {
                return Result.failure(ResultCode.PASSWORD_IS_NULL);
            }
        }else {
            return Result.failure(ResultCode.USER_NOT_EXIST);
        }
    }
}
