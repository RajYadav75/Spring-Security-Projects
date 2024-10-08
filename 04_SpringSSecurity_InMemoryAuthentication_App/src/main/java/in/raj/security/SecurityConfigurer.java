package in.raj.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfigurer {
    @Bean
    public InMemoryUserDetailsManager inMemoryUserDetailsManager() {
        UserDetails adminUser  = User.withDefaultPasswordEncoder()
                .username("Raj Yadav")
                .password("Raj@123")
                .authorities("ADMIN")
                .build();
        UserDetails normalUser  = User.withDefaultPasswordEncoder()
                .username("Baba Yaga")
                .password("baba@123")
                .authorities("USER")
                .build();
        return new InMemoryUserDetailsManager(adminUser, normalUser);
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
