package com.girish.springAnnotationsWithXMLConfig;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return "today is happy day";
    }
}
