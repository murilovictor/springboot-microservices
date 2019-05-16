package com.microservices.trainning.gateway.security.config;

import com.microservices.trainning.gateway.security.filter.GatewayJwtTokenAuthorizationFilter;
import com.microservices.trainning.security.config.SecurityTokenConfig;
import com.microservices.trainning.security.token.converter.TokenConverter;
import core.property.JwtConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

/**
 * @author MuriloVIctor
 */
@EnableWebSecurity
public class SecurityConfig extends SecurityTokenConfig {
    private final TokenConverter tokenConverter;

    public SecurityConfig(JwtConfiguration jwtConfiguration, TokenConverter tokenConverter) {
        super(jwtConfiguration);
        this.tokenConverter = tokenConverter;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.addFilterAfter(new GatewayJwtTokenAuthorizationFilter(jwtConfiguration, tokenConverter), UsernamePasswordAuthenticationFilter.class);
        super.configure(http);
    }
}
