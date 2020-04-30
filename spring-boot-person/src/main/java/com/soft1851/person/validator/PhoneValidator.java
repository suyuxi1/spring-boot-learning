package com.soft1851.person.validator;

import com.soft1851.person.annotation.PhoneNumber;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author su
 * @className PhoneValidator
 * @Description TODO
 * @Date 2020/4/30
 * @Version 1.0
 **/
public class PhoneValidator implements ConstraintValidator<PhoneNumber, String> {


    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        Pattern pattern = Pattern.compile("^1(3|4|5|6|7|8)\\d{9}$");
        Matcher matcher = pattern.matcher(s);
        return matcher.find();
    }
}
