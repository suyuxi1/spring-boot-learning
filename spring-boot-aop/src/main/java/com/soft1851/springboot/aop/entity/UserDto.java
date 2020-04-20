package com.soft1851.springboot.aop.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author su
 * @className UserDto
 * @Description TODO
 * @Date 2020/4/13 20:09
 * @Version 1.0
 **/

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {

    private String query;
    private String password;

}
