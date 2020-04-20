package com.soft1851.springboot.mbp.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * (SysUser)实体类
 *
 * @author makejava
 * @since 2020-04-16 08:57:40
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SysUser implements Serializable {
    private static final long serialVersionUID = 960017970125137080L;
    /**
    * 用户id
    */
    @TableId(value = "user_id", type = IdType.INPUT)
    private String userId;
    /**
    * 用户昵称
    */
    private String userName;
    /**
    * 密码
    */
    private String password;
    /**
    * 头像
    */
    private String avatar;
    /**
    * 真实姓名
    */
    private String realName;
    /**
    * 创建时间
    */
    private Date createTime;


}