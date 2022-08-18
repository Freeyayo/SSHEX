package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MutantPerson extends Person {
    private String name = "Mutant Person";

    private final Parrot parrot;

    public MutantPerson (@Qualifier("mutantParrot") Parrot mutantParrot) {
        this.parrot = mutantParrot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pet getPet() {
        return parrot;
    }
}
