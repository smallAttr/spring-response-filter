package com.github.smallAttr.controller;

import com.github.smallAttr.domain.User;
import com.github.smallAttr.facade.UserFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: chenGang
 * Date: 2018/12/7 10:36 AM
 */
@RestController
public class UserController {

    @Autowired
    private UserFacade userFacade;


    @GetMapping(value = "/user/login")
    public User login(@RequestParam("email") String email,
                      @RequestParam("password") String password) {
        return userFacade.login(email, password);
    }

}
