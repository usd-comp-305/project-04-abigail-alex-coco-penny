package edu.sandiego.comp305;

public class Character extends Person{
    public Character(final String name, final Age age,final int healthScore, final DNA dna) {
        super(name, age, healthScore, dna);
    }

    public double getBankBalance(){
        return 0.0;
    }

    public DNA getDNA(){
        return null;
    }

    public Location getLocation(){
        return null;
    }

    public Career getCareer(){
        return null;
    }

    public void chooseCareer(final Career career){}

    public void chooseLocation(final Location location){
    }

    @Override
    public String getLifeStage(){
        return "Character";
    }
}
