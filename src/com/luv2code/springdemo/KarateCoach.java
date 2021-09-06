package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class KarateCoach implements Coach {

    private FortuneService fortuneService;
    @Value("${karateCoach.name}")
    private String name;
    @Value("${karateCoach.fightStyle}")
    private String fightStyle;

    public KarateCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Kia!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public String getName() {
        return name;
    }

    public String getFightStyle() {
        return fightStyle;
    }
}
