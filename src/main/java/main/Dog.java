package main;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Dog extends Pet {
    private String name;

    @PostConstruct
    public void init () {
        this.name = "Dian Dian";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
