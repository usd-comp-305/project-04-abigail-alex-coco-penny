package edu.sandiego.comp305;

public class Character extends Person{
    public Character(String name, Age age, int healthScore, String phenotype) {
        super(name, age, healthScore, phenotype);
    }

    public double getBankBalance(){
        return 0.0;
    }

    public DNA getDNA(){
        return null;
    }

    public Location chooseLocation(){
        return null;
    }

    @Override
    public String getLifeStage(){
        return "Character";
    }
}
