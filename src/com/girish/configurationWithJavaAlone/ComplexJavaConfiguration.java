package com.girish.configurationWithJavaAlone;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComplexJavaConfiguration {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ComplexConfig.class);

        Coach chessCoach = context.getBean("chessCoach", Coach.class);
        chessCoach.getDailyWorkOut();
        context.close();
    }
}
