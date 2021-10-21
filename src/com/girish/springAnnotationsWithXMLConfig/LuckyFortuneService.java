package com.girish.springAnnotationsWithXMLConfig;

import org.springframework.stereotype.Component;

@Component
public class LuckyFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return "today is lucky day";
    }
}
