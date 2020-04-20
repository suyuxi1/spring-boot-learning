package com.soft1851.springboot.aop.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.PrintStream;

/**
 * @author su
 * @className User
 * @Description TODO
 * @Date 2020/4/13 18:57
 * @Version 1.0
 **/

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    private String id;
    private String phone;
    private String name;
    private String password;
    private String role;

}
