package edu.sandiego.comp305;

import java.util.ArrayList;

public class Child extends Person {

    public Child(final String name, final Age age, final DNA dna, final double bankBalance) {
        super(name, age, dna, bankBalance);
    }

    @Override
    public String getLifeStage(){
        return "Child";
    }

    public ArrayList<Person> getParents(){
        return null;
    }

    public void inheritTraits(final Person parent1, final Person parent2){
    }

}
