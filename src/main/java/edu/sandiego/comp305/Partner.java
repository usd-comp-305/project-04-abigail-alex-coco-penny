package edu.sandiego.comp305;

public class Partner extends Person{
    public Partner(String name, Age age, int healthScore, String phenotype) {
        super(name, age, healthScore, phenotype);
    }

    public double getBankBalance(){
        return 0.0;
    }

    public void setBankBalance(int bankBalance){
    }

    public double getCompatibilityScore(){
        return 0.0;
    }

    public void setCompatibilityScore(double compatibilityScore){}


    @Override
    public String getLifeStage(){
        return "Partner";
    }
}
