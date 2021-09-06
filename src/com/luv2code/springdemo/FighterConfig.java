package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:fighterCoaches.properties")
public class FighterConfig {


    @Bean
    public KnockOutFortuneService knockOutFortuneService() {
        return new KnockOutFortuneService();
    }

    @Bean
    public KarateCoach karateCoach() {
        return new KarateCoach(knockOutFortuneService());
    }
}
