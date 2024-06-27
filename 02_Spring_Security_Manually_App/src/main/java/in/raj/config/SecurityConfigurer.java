package in.raj.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfigurer {
    @Bean
    public SecurityFilterChain securityFilter(HttpSecurity http) throws Exception {
        System.out.println("Security filter method calling.......");
        // Logic to customize security
        http.authorizeHttpRequests( (req) ->
                req.antMatchers("/contact","/logincheck","/swagger-ui.html")
                        .permitAll()
                        .anyRequest()
                        .authenticated()
        ).formLogin();
       return http.build();
    }
}
