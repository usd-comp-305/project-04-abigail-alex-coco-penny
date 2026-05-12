package edu.sandiego.comp305;

import java.util.ArrayList;
import java.util.Random;

public class Child extends Person {

    private final DNA parent1Dna;

    private final DNA parent2Dna;

    public Child(final String name,
                 final Age age,
                 final DNA dna,
                 final Character parent1,
                 final Partner parent2,
                 final double bankBalance) {
        super(name, age, dna, bankBalance );
        this.parent1Dna = parent1.getDna();
        this.parent2Dna = parent2.getDna();
    }

    @Override
    public String getLifeStage(){
        return "Child";
    }

    public void inheritDNATraits(final Random rng){
        final DNA combinedParentsDNA = DNA.combineSequences(parent1Dna, parent2Dna, rng);
        setDNA(combinedParentsDNA);
    }

}
