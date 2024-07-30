package com.roger.springsecuritysection1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 2407009
 * @Description
 * @create 2024-07-30
 */
@RestController
public class WelcomeController {

    @GetMapping("/welcome")
    public String sayWelcome() {
        return "Welcome to Spring Application with out security.";
    }

}
