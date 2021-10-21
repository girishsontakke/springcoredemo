package com.girish.configurationWithJavaAlone;

public class ExerciseCoach implements Coach{
    FortuneService fortuneService;

    public ExerciseCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public void getDailyWorkOut() {
        System.out.println("Complete this exercise");
    }

    @Override
    public void getDailyFortune() {
        this.fortuneService.getDailyFortune();
    }
}
