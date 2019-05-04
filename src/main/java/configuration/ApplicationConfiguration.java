package configuration;

import mathOperation.Addition;
import mathOperation.MathOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

    @Bean
    static MathOperation getMathOperation(){
        return new Addition();
    }


}
