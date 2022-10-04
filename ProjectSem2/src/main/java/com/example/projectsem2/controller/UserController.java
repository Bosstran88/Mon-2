package com.example.projectsem2.controller;

import com.example.projectsem2.model.UserBO;
import com.example.projectsem2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public List<UserBO> list(){
        List<UserBO> list = userService.listUser();
        return list;
    }
}
