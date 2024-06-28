package in.raj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {
    @GetMapping("/greet")
    public String greetMsg(){
        return "Namaste Raj :) ";
    }

    @GetMapping("/welcome")
    public String welcomeMsg(){
        return "Swagat hai aap mere application par Raj :) ";
    }
    @GetMapping("/contact")
    public String contact(){
        return "Contact Us :) :: +91 89 56 23 11 44  ";
    }
}
