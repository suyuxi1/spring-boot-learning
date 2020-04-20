package com.soft1851.springboot.mbp.mapper;

import com.soft1851.springboot.mbp.entity.SysUser;
import org.apache.ibatis.annotations.Param;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.ColumnMap;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Map;

@SpringBootTest
class userMapperTest {

    @Resource
    private UserMapper mapper;

    @Test
    void selectAll() {
        List<SysUser> sysUsers = mapper.selectList(null);
        sysUsers.forEach(System.out::println);
    }

    @Test
    void insert(){
        int n = mapper.insert(SysUser.builder()
                .userId("123")
                .avatar("123")
                .createTime(new Date())
                .password("123")
                .realName("admin123")
                .userName("syx123").build());
        System.out.println(n);
    }

    @Test
    void deleteById(){
        System.out.println(mapper.deleteById("123"));
    }

    @Test
    void deleteByMap(){


    }

    @Test
    void delete(){

    }

    @Test
    void deleteBatchIds(){

    }

    @Test
    void updateById(){


    }

    @Test
    void update(){

    }

    @Test
    void selectById(){
        System.out.println(mapper.selectById("1"));
    }







}