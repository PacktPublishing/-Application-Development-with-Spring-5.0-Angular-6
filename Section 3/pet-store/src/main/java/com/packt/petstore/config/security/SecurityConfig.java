package com.packt.petstore.config.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.ReactiveAuthenticationManager;
import org.springframework.security.authentication.UserDetailsRepositoryReactiveAuthenticationManager;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.core.userdetails.ReactiveUserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.server.SecurityWebFilterChain;
import org.springframework.security.web.server.authentication.HttpBasicServerAuthenticationEntryPoint;
import org.springframework.security.web.server.authentication.RedirectServerAuthenticationSuccessHandler;
import org.springframework.security.web.server.authentication.ServerAuthenticationEntryPointFailureHandler;
import org.springframework.security.web.server.util.matcher.ServerWebExchangeMatchers;
import reactor.core.publisher.Mono;

@EnableWebFluxSecurity
public class SecurityConfig {

    @Autowired
    private ReactiveUserDetailsService reactiveUserDetailsService;

    @Bean
    public SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) {
        http
                .authorizeExchange()
                    .pathMatchers(HttpMethod.POST, "/login").permitAll()
                    .pathMatchers(HttpMethod.POST, "/logout").permitAll()
                    .pathMatchers(HttpMethod.POST, "/register").permitAll()
                    .anyExchange().authenticated()
                .and()
                .httpBasic().disable()
                .csrf().disable()
                .formLogin()
                    .authenticationManager(authenticationManager())
                    .requiresAuthenticationMatcher(ServerWebExchangeMatchers.pathMatchers(HttpMethod.POST, "/login"))
                    .authenticationSuccessHandler(new RedirectServerAuthenticationSuccessHandler("/pets"))
                    .authenticationFailureHandler(new ServerAuthenticationEntryPointFailureHandler(new HttpBasicServerAuthenticationEntryPoint()))
                    .authenticationEntryPoint(new HttpBasicServerAuthenticationEntryPoint())
                .and()
                .logout()
                    .logoutSuccessHandler(((exchange, authentication) -> Mono.fromRunnable(() -> exchange.getExchange().getResponse().setStatusCode(HttpStatus.OK))));

        return http.build();
    }

    @Bean
    public ReactiveAuthenticationManager authenticationManager() {
        UserDetailsRepositoryReactiveAuthenticationManager authManager =
                new UserDetailsRepositoryReactiveAuthenticationManager(reactiveUserDetailsService);

        authManager.setPasswordEncoder(passwordEncoder());
        return authManager;
    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }
}
