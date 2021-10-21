package com.girish.springAnnotationsWithXMLConfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("annotationContext.xml");


        // get a bean
        Coach coach = context.getBean("tennisCoach", Coach.class);

        // call the methods on bean
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());

        context.close();
    }
}
