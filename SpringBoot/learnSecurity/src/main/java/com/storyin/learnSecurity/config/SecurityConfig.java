package com.storyin.learnSecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.CsrfConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration  // this annotation tells spring that this is a configuration file.
@EnableWebSecurity // this annotation says that don't go with a default configuration go with this configuration.
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {

//        Customizer<CsrfConfigurer<HttpSecurity>> customizerCSRF = new Customizer<CsrfConfigurer<HttpSecurity>>() {
//            @Override
//            public void customize(CsrfConfigurer<HttpSecurity> customizer) {
//                customizer.disable();
//            }
//        };

        return httpSecurity
                .csrf( customizer -> customizer.disable() )
                .authorizeHttpRequests( req -> req.anyRequest().authenticated() )
                .formLogin( Customizer.withDefaults() ) // it will provide form to login in browser
                .httpBasic( Customizer.withDefaults() ) // it will allow authentication in postman also
                .sessionManagement( session -> session.sessionCreationPolicy( SessionCreationPolicy.STATELESS ) ) // this will create new session each time.
                .build();
    }

}
