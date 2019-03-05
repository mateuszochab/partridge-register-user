package com.ochabmateusz.partridge.partridgeregisteruser.controller;


import com.ochabmateusz.partridge.partridgeregisteruser.entity.User;
import com.ochabmateusz.partridge.partridgeregisteruser.entity.UserCore;
import com.ochabmateusz.partridge.partridgeregisteruser.serviceInterface.UserRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register")
public class RegisterController {


    private final UserRegisterService userRegisterService;

    @Autowired
    public RegisterController(UserRegisterService userRegisterService) {
        this.userRegisterService = userRegisterService;
    }

    @PostMapping("/user")
    public void registerUser(@RequestBody UserCore userCore) {
        User user = new User(userCore);

        userRegisterService.RegisterNewUser(user);
    }


}
