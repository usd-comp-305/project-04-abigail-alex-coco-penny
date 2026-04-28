package edu.sandiego.comp305;

import java.util.ArrayList;

public class Child extends Person {

    public Child(String name, Age age, int healthScore, String phenotype) {
        super(name, age, healthScore, phenotype);
    }

    @Override
    public String getLifeStage(){
        return "Child";
    }
    public ArrayList<Person> getParents(){
        return null;
    }
    public void inheritTraits(Person parent1, person parent2){
    }

}
