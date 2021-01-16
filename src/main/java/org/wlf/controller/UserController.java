package org.wlf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wlf.bean.Result;
import org.wlf.service.UserService;

@RestController
@RequestMapping(value = "user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping(value = "get")
    public String getUser(){
        return new Result(userService.getData()).toString();
    }

}
