package edu.sandiego.comp305;

public class Partner extends Person{
    public Partner(String name, Age age, int healthScore, String phenotype) {
        super(name, age, healthScore, phenotype);
    }

    public double getBankBalance(){
        return 0.0;
    }

    public double getCompatibilityScore(){
        return 0.0;
    }

    public Career getCareer(){
        return null;
    }

    public Location getLocation(){
        return null;
    }

    public void setCompatibilityScore(double compatibilityScore){}


    public void setBankBalance(int bankBalance){
    }

    public void chooseCareer(Career career){
    }

    public void chooseLocation(Location location){
    }

    @Override
    public String getLifeStage(){
        return "Partner";
    }
}
