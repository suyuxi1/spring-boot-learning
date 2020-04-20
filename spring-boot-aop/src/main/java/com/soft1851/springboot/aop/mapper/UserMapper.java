package com.soft1851.springboot.aop.mapper;

import com.soft1851.springboot.aop.entity.User;
import com.soft1851.springboot.aop.entity.UserDto;
import org.apache.ibatis.annotations.Select;

/**
 * @author Su
 * @className UserMapper
 * @Description TODO
 * @Date 2020/4/13 18:59
 * @Version 1.0
 **/

public interface UserMapper {


    @Select("SELECT * FROM t_user WHERE phone = #{query}")
    User selectByPhone(UserDto userDto);


}
