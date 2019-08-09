package com.mj.controller;

import com.mj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/index", produces = "text/html;charset=UTF-8")
    public String index() {

        return userService.index();
    }

}
