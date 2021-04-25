package com.study.kaelthas.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qushengxu
 * @description todo
 * @date 2021/4/25 11:34
 **/
@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/qsx/{id}")
    public Object test(@PathVariable("id") Long id) {
        return "111";
    }
}
