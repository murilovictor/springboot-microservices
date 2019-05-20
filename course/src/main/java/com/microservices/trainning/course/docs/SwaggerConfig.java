package com.microservices.trainning.course.docs;

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
        super("com.microservices.trainning.course.endpoint.controller");
    }
}
