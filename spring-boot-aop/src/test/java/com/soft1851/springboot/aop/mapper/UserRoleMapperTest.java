package com.soft1851.springboot.aop.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserRoleMapperTest {
    @Resource
    private UserRoleMapper mapper;

    @Test
    void getUserRole() {
        Map<String,Object> map = mapper.getUserRole("2");
        List<Map<String, Object>> list = (List<Map<String, Object>>) map.get("role");
        System.out.println(list.get(0).get("role_name"));
    }
}