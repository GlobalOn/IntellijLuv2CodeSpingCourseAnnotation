package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@ComponentScan("com.luv2code.springdemo")
@PropertySources({@PropertySource("classpath:logger.properties"), @PropertySource("classpath:jumpCoach.properties")})
public class SportConfig {

    @Bean
    public MyLoggerConfig getLogger(@Value("${root.logger.level}") String rootLoggerLevel, @Value("${printed.logger.level}") String consolePrintedLoggerLevel) {
        return new MyLoggerConfig(rootLoggerLevel, consolePrintedLoggerLevel);
    }

    //Define bean for Sad Fortune service
    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    //Define Jump Coach bean and inject there Sad Fortune service
    @Bean
    public Coach jumpCoach(@Value("${jumpCoach.name}") String jumpCoachName,
                           @Value("${jumpCoach.address}") String jumpCoachAddress,
                           @Value("${jumpCoach.team}") String jumpCoachTeam) {
        return new JumpCoach(sadFortuneService(), jumpCoachName, jumpCoachAddress, jumpCoachTeam);
    }

}

