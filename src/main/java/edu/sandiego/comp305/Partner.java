package edu.sandiego.comp305;

import java.util.Random;

public class Partner extends Person{

    private double compatibilityScore;

    private Location location;

    private Career career;

    public Partner(final String name, final Age age, final DNA dna, final double bankBalance) {
        super(name, age, dna, bankBalance);
        this.compatibilityScore = 0.0;
    }


    public double getCompatibilityScore(){
        return compatibilityScore;
    }

    public Career getCareer(){
        return career;
    }

    public void generateDNA(final Random rng){
        setDNA(DNA.generateRandomDNA(rng));
    }

    @Override
    public Location getLocation(){
        return location;
    }

    public void setCompatibilityScore(final double compatibilityScore){
        this.compatibilityScore = compatibilityScore;
    }

    public void chooseCareer(final Career career){
        this.career = career;
    }

    public void chooseLocation(final Location location){
        this.location = location;
    }

    public void calculateBankBalance(){
    }

    @Override
    public String getLifeStage(){
        return "Partner";
    }
}
