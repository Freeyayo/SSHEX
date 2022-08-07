package config;

import main.Parrot;
import main.Person;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "main")
public class ProjectConfig {
    @Bean
    Parrot parrot () {
        var p = new Parrot();
        p.setName("Koko");
        return p;
    }
    @Bean
    Person projectConfigManager () {
        Person pcm = new Person();
        pcm.setName("project configuration manager");
        pcm.setPet(parrot());
        return pcm;
    }
    @Bean
    Person projectConfigManagerAssistant () {
        Person pcma = new Person();
        pcma.setName("project configuration manager assistant");
        pcma.setPet(parrot());
        return pcma;
    }
    @Bean
    String hello () {
        return "hello";
    }
    @Bean
    Integer ten () {
        return 10;
    }
}

