package com.soft1851.person.entity;

import com.fasterxml.jackson.core.SerializableString;
import com.soft1851.person.annotation.PhoneNumber;
import com.soft1851.person.annotation.Region;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.validation.constraints.*;


/**
 * @author su
 * @className Person
 * @Description TODO
 * @Date 2020/4/30
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    @NotNull(message = "Id 不能为空")
    private String id;

    @Size(max = 30)
    @NotNull(message = "name 不能为空")
    private String name;

    @Min(18)
    private Integer age;

//    @Pattern(regexp = "^1(3|4|5|7|8)\\d{9}$", message = "手机号格式错误")
    @PhoneNumber
    @NotBlank(message = "手机号码不能为空")
    private String phone;

    @NotNull(message = "email 不能为空")
    @Email(message = "邮箱格式不正确")
    private String email;

    @Pattern(regexp = "((^Man$|^Woman$|^UGM$))", message = "sex 值不在可范围")
    @NotNull(message = "sex 不能为空")
    private String sex;

//    @Region
//    private String region;






}
