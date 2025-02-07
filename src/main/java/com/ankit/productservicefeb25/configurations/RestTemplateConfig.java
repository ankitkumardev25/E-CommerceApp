package com.ankit.productservicefeb25.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {
    //we will create a Bean of RestTemplate in this class
    //Note: name of the Class and the name of the method does not make any difference.

    @Bean
    public RestTemplate createRestTemplate() {
        return new RestTemplate();
    }
}
