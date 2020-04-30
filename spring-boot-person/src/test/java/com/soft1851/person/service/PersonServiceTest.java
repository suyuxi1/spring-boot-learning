package com.soft1851.person.service;

import com.soft1851.person.entity.Person;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cglib.transform.ClassTransformer;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.annotation.Resource;
import javax.validation.ConstraintViolationException;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PersonServiceTest {

    @Resource
    private PersonService personService;

    @Test
    @ExceptionHandler(ConstraintViolationException.class)
    void validatePerson() {
        Person person = new Person();
        person.setId("12336");
        person.setName("Soft1851");
        person.setAge(20);
        person.setPhone("13457513856");
        person.setEmail("Soft1851@qq.com");
        person.setSex("Man");
        personService.validatePerson(person);

    }


}