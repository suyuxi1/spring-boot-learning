package com.soft1851.springboot.aop.controller;

import com.soft1851.springboot.aop.annotation.ControllerWebLog;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author su
 * @className HelloController
 * @Description TODO
 * @Date 2020/4/12 16:06
 * @Version 1.0
 **/
@RestController
@RequestMapping(value = "/api/")
@Slf4j
public class HelloController {
    @RequestMapping(value = "hello")
    @ControllerWebLog(name = "getHello", isSaved = true)
    public String getHello(String arg1, int arg2) {
        log.info("控制层获取参数："+ arg1);
        log.info("控制层获取参数："+ arg2);
        //休眠，获取接口耗时
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Hello spring boot";
    }

    @RequestMapping(value = "hello1")
    public String hello(String name){
        return "Hello " + name;
    }


}