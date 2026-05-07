package edu.sandiego.comp305;

import java.util.ArrayList;
import java.util.List;

public class Child extends Person {

    private Character parent1;

    private Partner parent2;



    public Child(final String name,
                 final Age age,
                 final int healthScore,
                 final DNA dna,
                 final Character parent1,
                 final Partner parent2) {
        super(name, age, healthScore, dna);
        this.parent1 = parent1;
        this.parent2 = parent2;
    }

    @Override
    public String getLifeStage(){
        return "Child";
    }

    public Character getParent1() {
        return parent1;
    }

    public Partner getParent2() {
        return parent2;
    }

    public List<Person> getParents(){
        return null;
    }

    public void inheritHealthTraits(){
        final int averageHealth = (parent1.getHealthScore() + parent2.getHealthScore()) /2;
        setHealthScore(averageHealth);
    }

}
