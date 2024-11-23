package com.storyin.journalApp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SpringSecurity {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeRequests(authz -> authz
                        .anyRequest().authenticated() // All requests require authentication
                )
                .formLogin(login -> login
                        .permitAll() // Enable form-based login
                )
                .logout(logout -> logout
                        .permitAll() // Enable logout
                );
        return http.build();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        // In-memory user store for simplicity
        var user = User.withDefaultPasswordEncoder() // Not recommended for production
                .username("user")
                .password("password")
                .roles("USER")
                .build();

        return new InMemoryUserDetailsManager(user);
    }
}
