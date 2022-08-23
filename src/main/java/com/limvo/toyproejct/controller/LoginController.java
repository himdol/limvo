package com.limvo.toyproejct.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @GetMapping("/api/token")
    public String getTokenWithApi(){
        return "";
    }
}
