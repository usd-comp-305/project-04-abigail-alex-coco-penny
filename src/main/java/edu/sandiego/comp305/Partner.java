package edu.sandiego.comp305;

public class Partner extends Person{
    public Partner(String name, Age age, int healthScore, String phenotype) {
        super(name, age, healthScore, phenotype);
    }

    @Override
    public String getLifeStage(){
        return "Partner";
    }
    public int getBankBalance(){
        return 0;
    }
    public void setBankBalance(int bankBalance){
    }
    public int getCompatibilityScore(){
        return 0;
    }
    public void setCompatibilityScore(int compatibilityScore){}
}
