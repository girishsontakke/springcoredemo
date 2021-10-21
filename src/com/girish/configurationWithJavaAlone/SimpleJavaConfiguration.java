package com.girish.configurationWithJavaAlone;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SimpleJavaConfiguration {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SimpleConfig.class);

        Coach myCoach = context.getBean("swimCoach", Coach.class);
        myCoach.getDailyWorkOut();
        myCoach.getDailyFortune();

        context.close();
    }

}
