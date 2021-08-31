package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    private FortuneService fortuneService;

//    @Autowired
//    public TennisCoach(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }

    //Setter Injection
//    @Autowired
//    public void setFortuneService(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }

    //Using annotations we can inject by methods with any names (NOT ONLY SETTERS)
    //The main thing is to use @Autowired annotation
    @Autowired
    public void blablaFooBla(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "TennisDailyWorkout";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
