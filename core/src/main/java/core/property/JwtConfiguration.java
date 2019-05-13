package core.property;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.context.annotation.Configuration;

/**
 * @author MuriloVIctor
 */
@Configuration
@ConfigurationProperties(prefix = "jwt.config")
@Getter
@Setter
@ToString
public class JwtConfiguration {
    @NestedConfigurationProperty
    private Header header = new Header();
    private String loginUrl = "/login/**";
    private String type = "encrypted";
    private String privateBy = "IT1Q40JG8I7YysCh5VL0vh6ZAV1uhQRC"; // Gerado através do Site: http://www.unit-conversion.info/texttools/random-string-generator/
    private int expiration = 3600;

    @Getter
    @Setter
    public static class Header {
        private String name = "Authorization";
        private String prefix = "Bearer ";
    }
}
