package com.luv2code.springdemo;

public class KnockOutFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Hard KnockOut punch!";
    }
}
