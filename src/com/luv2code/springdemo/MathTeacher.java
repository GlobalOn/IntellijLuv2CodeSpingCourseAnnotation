package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class MathTeacher  implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Calculate 5 exercises!";
    }
}
