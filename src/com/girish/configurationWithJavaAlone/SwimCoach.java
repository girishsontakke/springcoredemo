package com.girish.configurationWithJavaAlone;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
    FortuneService fortuneService;
    @Value("${foo.email}")
    String email;

    @Value("${foo.team}")
    String team;

    SwimCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public void getDailyWorkOut() {
        System.out.println("MY email is " + this.email + "\nand my team is " + this.team);
        System.out.println("practice swimming");
    }

    @Override
    public void getDailyFortune() {
        this.fortuneService.getDailyFortune();
    }
}
