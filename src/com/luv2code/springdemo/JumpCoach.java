package com.luv2code.springdemo;

public class JumpCoach implements Coach {

    private FortuneService fortuneService;
    private String name;
    private String address;
    private String team;

    public JumpCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public JumpCoach(FortuneService fortuneService, String name, String address, String team) {
        this.fortuneService = fortuneService;
        this.name = name;
        this.address = address;
        this.team = team;
    }

    @Override
    public String getDailyWorkout() {
        return "Jump 5 times!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getTeam() {
        return team;
    }
}
