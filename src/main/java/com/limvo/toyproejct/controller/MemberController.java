package com.limvo.toyproejct.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    @GetMapping("/api/index")
    public String test(){
        return "HELLO WORLD";
    }
}
