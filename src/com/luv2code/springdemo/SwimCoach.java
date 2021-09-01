package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach{

    private FortuneService fortuneService;
    @Value("${foo.name}")
    private String name;
    @Value("${foo.address}")
    private String address;

    @Autowired
    public SwimCoach(@Qualifier("randomFortuneService") FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String getDailyWorkout() {
        return fortuneService.getFortune();
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
