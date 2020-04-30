package com.soft1851.person.controller;

import com.soft1851.person.entity.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Size;

/**
 * @author su
 * @className PersonController
 * @Description 使用Springboot框架自带的ResponseEntity
 * @Date 2020/4/30
 * @Version 1.0
 **/
@RestController
@RequestMapping("/api")
@Slf4j
@Validated
public class PersonController {

    @PostMapping("/person")
    public ResponseEntity<Person> savePerson(@RequestBody @Valid Person person){
        log.info("入参对象:" + person);
        return ResponseEntity.ok().body(person);
    }

    @GetMapping("/person/{id}")
    public ResponseEntity<String> getPersonById(@Valid @PathVariable("id") @Size(min = 6, message = "id不能小于6位")String id){
        return ResponseEntity.ok().body(id);
    }

    @GetMapping("/person")
    public ResponseEntity<String> getPersonByName(@Valid @RequestParam("name") @Size(max = 10, message = "name长度超出范围") String name){
        return ResponseEntity.ok().body(name);
    }

}
