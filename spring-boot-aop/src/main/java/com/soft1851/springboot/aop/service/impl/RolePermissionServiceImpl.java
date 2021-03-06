package com.soft1851.springboot.aop.service.impl;

import com.soft1851.springboot.aop.mapper.RolePermissionMapper;
import com.soft1851.springboot.aop.mapper.SysPermissionMapper;
import com.soft1851.springboot.aop.service.RolePermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author su
 * @className RolePermissionServiceImpl
 * @Description TODO
 * @Date 2020/4/14 9:56
 * @Version 1.0
 **/
@Service
public class RolePermissionServiceImpl implements RolePermissionService {
    @Resource
    private RolePermissionMapper mapper;
    @Resource
    private SysPermissionMapper permissionMapper;

    @Override
    public List<Map<String, Object>> getAdminRolePermission() {
        return permissionMapper.getParentPermission();
    }

    @Override
    public List<Map<String, Object>> getRolePermissionBySysAdmin(int sysAdminId) {
        return mapper.getRoleById(sysAdminId);
    }
}
