package com.lentra.SecurityApp.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration // telling spring that this is configuration file to spring.
@EnableWebSecurity // overriding default security configurations.
public class SpringConfig {

    @Autowired
    private UserDetailsService userDetailsService;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        // Disable Cross-Site Request Forgery (CSRF) protection
        http.csrf(customizer -> customizer.disable( ));

        // Require authentication for all requests
        http.authorizeHttpRequests(req -> req.anyRequest( ).authenticated( ));

        // Configure form-based login with default settings
        // http.formLogin(Customizer.withDefaults( ));

        // Enable basic authentication for testing with tools like Postman
        http.httpBasic(Customizer.withDefaults( ));

        // Set session management to stateless, meaning no server-side session will be created
        http.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));

        // Build and return the security filter chain
        return http.build( );

    };

    @Bean
    public AuthenticationProvider authenticationProvider(){
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider(  );

        provider.setPasswordEncoder(new BCryptPasswordEncoder( 12 ));
        provider.setUserDetailsService(userDetailsService);
        return provider;
    }

//    @Bean
//    public UserDetailsService userDetailsService(){
//
//        UserDetails userDetails1 = User
//                .withDefaultPasswordEncoder()
//                .username("surajmate")
//                .password("suraj@123")
//                .roles("USER")
//                .build();
//
//        UserDetails userDetails2 = User
//                .withDefaultPasswordEncoder()
//                .username("shubhamsawai")
//                .password("shubham@123")
//                .roles("USER")
//                .build();
//
//        return new InMemoryUserDetailsManager( userDetails2, userDetails1 );
//    }

}
