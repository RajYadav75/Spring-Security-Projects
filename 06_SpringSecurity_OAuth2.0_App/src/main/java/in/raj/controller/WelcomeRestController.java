package in.raj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
    @GetMapping("/")
    public String welcomeMsg(){
        return "(: Welcome Back Sir in my Spring Security Projects In my Github Repository  :) ";
    }
}
