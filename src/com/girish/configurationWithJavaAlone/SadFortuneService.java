package com.girish.configurationWithJavaAlone;

public class SadFortuneService implements FortuneService{
    @Override
    public void getDailyFortune() {
        System.out.println("today is sad day");
    }
}
