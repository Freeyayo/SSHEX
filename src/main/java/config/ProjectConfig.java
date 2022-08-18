package config;

import main.Parrot;
import main.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "main")
public class ProjectConfig {
    @Bean
    @Primary
    public Parrot parrot () {
        var p = new Parrot();
        p.setName("Koko");
        return p;
    }
    @Bean
    public Parrot mutantParrot () {
        var p = new Parrot();
        p.setName("Mutant Parrot");
        return p;
    }
    @Bean
    public Person projectConfigManager () {
        Person pcm = new Person();
        pcm.setName("project configuration manager");
        pcm.setPet(parrot());
        return pcm;
    }
    @Bean
    public Person projectConfigManagerAssistant (Parrot parrot) {
        Person pcma = new Person();
        pcma.setName("project configuration manager assistant");
        pcma.setPet(parrot);
        return pcma;
    }
    @Bean
    public String hello () {
        return "hello";
    }
    @Bean
    public Integer ten () {
        return 10;
    }
}

