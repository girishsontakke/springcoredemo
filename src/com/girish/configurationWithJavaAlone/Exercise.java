package com.girish.configurationWithJavaAlone;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Exercise {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ExerciseConfig.class);

        Coach exerciseCoach = context.getBean("exerciseCoach", Coach.class);
        exerciseCoach.getDailyFortune();
        exerciseCoach.getDailyWorkOut();
    }
}
