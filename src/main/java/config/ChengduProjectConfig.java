package config;

import main.Parrot;
import main.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChengduProjectConfig {
    @Bean
    Person projectConfigManager (Parrot parrot) {
        Person chengduPcm = new Person();
        chengduPcm.setName("Chengdu project configuration manager");
        chengduPcm.setPet(parrot);
        return chengduPcm;
    }
}
