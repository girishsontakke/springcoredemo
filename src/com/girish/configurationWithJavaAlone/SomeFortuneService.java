package com.girish.configurationWithJavaAlone;

import org.springframework.stereotype.Component;

@Component
public class SomeFortuneService implements FortuneService{
    @Override
    public void getDailyFortune() {
        System.out.println("some fortune");
    }
}
