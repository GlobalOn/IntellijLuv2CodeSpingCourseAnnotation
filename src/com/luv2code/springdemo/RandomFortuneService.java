package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    private List<String> randomFortunes = List.of("FooBar", "BlaBla", "Happy new Year!");
    Random random = new Random();

    @Override
    public String getFortune() {
        int randomFortune = random.nextInt(randomFortunes.size());
        return randomFortunes.get(randomFortune);
    }
}
