package com.limvo.toyproejct.controller;

import com.limvo.toyproejct.service.LoginService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    private LoginService loginService;
    public LoginController(LoginService loginService){
        this.loginService = loginService;
    }

}
