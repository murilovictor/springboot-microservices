package core.docs;

import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author MuriloVIctor
 */

public class BaseSwaggerConfig {

    private final String basePackege;

    public BaseSwaggerConfig(String basePackege) {
        this.basePackege = basePackege;
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage(basePackege))
                .build()
                .apiInfo(metaData());
    }

    private ApiInfo metaData() {
        return new ApiInfoBuilder()
                .title("MicroServices com Spring Boot")
                .description("Projeto utilizado para treinamento")
                .version("1.0")
                .contact(new Contact("Murilo Victor", "https://www.linkedin.com/in/murilovictor", "murilovictor63@gmail.com"))
                .license("Liberado para Estudos")
                .licenseUrl("https://www.linkedin.com/in/murilovictor")
                .build();
    }

}
