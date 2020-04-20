package com.soft1851.springboot.aop.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SysUserMapperTest {
    @Resource
    private SysUserMapper mapper;

    @Test
    void getUserById() {
        System.out.println(mapper.getUserById("2"));
    }
}