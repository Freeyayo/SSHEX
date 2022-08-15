package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DogOwner extends Person {
    private String name = "Kevin";
    private final Pet parrot;

    @Autowired
    public DogOwner(Parrot parrot){
        this.parrot = parrot;
    }

    @Autowired
    private Dog dog;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public main.Pet getParrot() {
        return parrot;
    }
}
