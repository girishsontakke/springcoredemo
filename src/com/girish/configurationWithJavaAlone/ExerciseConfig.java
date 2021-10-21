package com.girish.configurationWithJavaAlone;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("sport.properties")
public class ExerciseConfig {
    @Bean
    public FortuneService exerciseFortuneService(){
        return new ExerciseFortuneService();
    }

    @Bean
    public ExerciseCoach exerciseCoach(){
        return new ExerciseCoach(exerciseFortuneService());
    }
}
