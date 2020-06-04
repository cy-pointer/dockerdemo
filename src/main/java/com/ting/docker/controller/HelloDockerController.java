package com.ting.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sie_zj
 * @create 2020-06-03 15:11
 **/
@RestController
public class HelloDockerController {
    @GetMapping("hello")
    public String hello() {
        return "hello docker!";
    }
}
