package com.girish.springAnnotationsWithXMLConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Component
@Scope("singleton")
public class TennisCoach implements Coach {
    private FortuneService fortuneService;

    // Field injection
    @Value("${foo.email}")
    private String email;
    @Value("${foo.team}")
    private  String team;

    // constructor injection
    @Autowired
    TennisCoach(@Qualifier("luckyFortuneService") FortuneService fortuneService){
        this.fortuneService = fortuneService;

    }

    // setter injection
//    @Autowired
//    @Qualifier("luckyFortuneService")
//    private void setFortuneService(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }


    // init method
    @PostConstruct
    public void runAtStart(){
        System.out.println("I am running at the creation of bean");
    }

    // destroy method
    @PreDestroy
    public void runAtEnd(){
        Path path = Paths.get("src/com/girish/springAnnotationsWithXMLConfig/fortunes.txt");
        Path absolute = path.toAbsolutePath();
        List<String> theFortunes = new ArrayList<>();
        File file = new File(absolute.toString());
        try (BufferedReader br = new BufferedReader(
                new FileReader(file))) {

            String tempLine;

            while ((tempLine = br.readLine()) != null) {
                theFortunes.add(tempLine);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        for(String fortune: theFortunes)
            System.out.println(fortune);
    }

    @Override
    public String getDailyWorkout() {
        System.out.println("email of the tennisCoach is " + this.email);
        System.out.println("team of the tennisCoach is " + this.team);
        return "Practice tennis";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
