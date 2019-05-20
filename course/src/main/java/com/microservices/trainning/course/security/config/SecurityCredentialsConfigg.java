package com.microservices.trainning.course.security.config;


import com.microservices.trainning.security.config.SecurityTokenConfig;
import com.microservices.trainning.security.filter.JwtTokenAuthorizationFilter;
import com.microservices.trainning.security.token.converter.TokenConverter;
import core.property.JwtConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

/**
 * @author MuriloVIctor
 */
@EnableWebSecurity
public class SecurityCredentialsConfigg extends SecurityTokenConfig {

    private final TokenConverter tokenConverter;

    public SecurityCredentialsConfigg(JwtConfiguration jwtConfiguration, TokenConverter tokenConverter) {
        super(jwtConfiguration);
        this.tokenConverter = tokenConverter;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.addFilterAfter(new JwtTokenAuthorizationFilter(jwtConfiguration, tokenConverter), UsernamePasswordAuthenticationFilter.class);
        super.configure(http);
    }
}
