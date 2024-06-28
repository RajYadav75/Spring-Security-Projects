package in.raj.security;

import in.raj.service.MyUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfigurer {
    @Autowired
    private MyUserDetailsService myUserDetailsService;
    @Autowired
    public void ConfigureUser(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(myUserDetailsService)
                .passwordEncoder(NoOpPasswordEncoder.getInstance());
    }



    @Bean
    public SecurityFilterChain securityConfig(HttpSecurity http) throws Exception {
        http.authorizeRequests((req)->
                req.antMatchers("/contact")
                        .permitAll()
                        .anyRequest()
                        .authenticated()
        ).formLogin();
        return http.build();
    }
}
