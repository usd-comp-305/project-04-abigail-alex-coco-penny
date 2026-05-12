package edu.sandiego.comp305;

import java.util.ArrayList;
import java.util.Random;

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

    public void inheritDNATraits(final Random rng){
        final DNA combinedParentsDNA = DNA.combineSequences(parent1Dna, parent2Dna, rng);
        setDNA(combinedParentsDNA);
    }

}
