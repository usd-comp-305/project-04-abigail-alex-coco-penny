package edu.sandiego.comp305;

import java.util.ArrayList;

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

    public ArrayList<Person> getParents(){
        return null;
    }

    public void inheritTraits(final Person parent1, final Person parent2){
    }

}
