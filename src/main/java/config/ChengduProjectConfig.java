package config;

import main.Parrot;
import main.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChengduProjectConfig {
//    private AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
    @Bean
    Person chengduProjectConfigManager (Parrot parrot) {
//        Parrot parrot = this.context.getBean(Parrot.class);
        Person chengduPcm = new Person();
        chengduPcm.setName("Chengdu project configuration manager");
        chengduPcm.setPet(parrot);
        return chengduPcm;
    }
}
