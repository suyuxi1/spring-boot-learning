package com.soft1851.springboot.aop.mapper;

import com.soft1851.springboot.aop.entity.User;
import com.soft1851.springboot.aop.entity.UserDto;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;


@SpringBootTest

class UserMapperTest {

    @Resource
    private UserMapper userMapper;

    @Test
    void selectByPhone() {
        System.out.println(userMapper.selectByPhone(UserDto.builder().query("13457513856").build()));
    }
}