package in.raj.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("loadUserByUsername method is called  :: ->    (:    ");
        /*Logic to get user Data
                                this is come when we connect database connection userRepo.findByUsername(name);*/

        return new User("Raj","Raj@123", Collections.emptyList());
    }
}
