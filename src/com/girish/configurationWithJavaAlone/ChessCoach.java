package com.girish.configurationWithJavaAlone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ChessCoach implements Coach{
    FortuneService fortuneService;

    @Autowired
    ChessCoach(@Qualifier("someFortuneService") FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    public void getDailyWorkOut(){
        System.out.println("practice chess");
    }

    @Override
    public void getDailyFortune() {
        this.fortuneService.getDailyFortune();
    }
}
