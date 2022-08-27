package com.limvo.toyproejct.config;

import com.limvo.toyproejct.service.LoginOAuth2Service;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    private final LoginOAuth2Service loginOAuth2Service;

    public SecurityConfig(LoginOAuth2Service loginOAuth2Service) {
        this.loginOAuth2Service = loginOAuth2Service;
    }

    @Bean
    public WebSecurityCustomizer webSecurityCustomizer() {
        return (web -> web.ignoring().antMatchers("/**","/favicon.ico"));
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
//        return httpSecurity
//                .authorizeRequests()
//                .antMatchers("/login")
//                .permitAll()
//                .and()
//                .oauth2Login();
        /// TODO: 2022/08/27 security 구현 
        return null;

    }

}
