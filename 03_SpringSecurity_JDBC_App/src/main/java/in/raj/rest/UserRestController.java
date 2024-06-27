package in.raj.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {
    //Only Admin role users can access this method
    @GetMapping(value = "/admin")
    public String admin() {
        return "<h3>Welcome Raj :) </h3>";
    }

    // Admin and User role users can access this method
    @GetMapping(value = "/user")
    public String user() {
        return "<h3>Welcome User :) </h3>";
    }

    // Any body can access this method
    @GetMapping(value = "/welcome")
    public String welcome() {
        return "<h3>Welcome :) </h3>";
    }
}
