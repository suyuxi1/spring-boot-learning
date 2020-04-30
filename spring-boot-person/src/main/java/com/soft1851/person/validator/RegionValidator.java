package com.soft1851.person.validator;

import com.soft1851.person.annotation.Region;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.HashSet;

/**
 * @author su
 * @className RegionValidator
 * @Description TODO
 * @Date 2020/4/30
 * @Version 1.0
 **/

public class RegionValidator implements ConstraintValidator<Region, String> {

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        HashSet<Object> region = new HashSet<>();
        region.add("China");
        region.add("China-TaiWan");
        region.add("China-HongKong");
        return region.contains(s);
    }
}
