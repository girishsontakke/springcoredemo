package com.girish.configurationWithJavaAlone;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
public class SimpleConfig {
    @Bean
    public FortuneService sadFortuneService(){
        return new SadFortuneService();
    }
    @Bean
    public Coach swimCoach(){
        return new SwimCoach(sadFortuneService());
    }
}