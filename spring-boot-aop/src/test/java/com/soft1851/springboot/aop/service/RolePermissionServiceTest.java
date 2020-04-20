package com.soft1851.springboot.aop.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class RolePermissionServiceTest {
    @Resource
    private RolePermissionService service;

    @Test
    void getRolePermissionByAdmin() {
        System.out.println(service.getAdminRolePermission());;
    }

    @Test
    void getRolePermissionBySysAdmin() {
    }
}