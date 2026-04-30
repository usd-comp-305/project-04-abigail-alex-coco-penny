package edu.sandiego.comp305;

public class Character extends Person{
    public double getBankBalance(){
        return 0.0;
    }

    public DNA getDNA(){
        return null;
    }

    @Override
    public String getLifeStage(){
        return "Character";
    }
}
