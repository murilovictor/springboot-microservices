package com.microservices.trainning.auth.docs;

import core.docs.BaseSwaggerConfig;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author MuriloVIctor
 */

@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {

    public SwaggerConfig() {
        super("com.microservices.trainning.auth.endpoint.controller");
    }
}
