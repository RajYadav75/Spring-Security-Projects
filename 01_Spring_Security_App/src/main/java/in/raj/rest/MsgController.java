package in.raj.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgController {
    @GetMapping("/hi")
    public String sayHi(){
        return "Hi Raj, How are you?";
    }
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello Raj, How are you?";
    }
    @GetMapping("/contact")
    public String contact(){
        return "Call us :: +91 89 56 23 45 78";
    }

    @GetMapping("/logincheck")
    public String login(){
        return "Login Page Loading ::: ";
    }

}
