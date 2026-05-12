package edu.sandiego.comp305;

public class Partner extends Person{

    private double bankBalance;

    private double compatibilityScore;

    private Location location;

    private Career career;

    public Partner(final String name, final Age age, final int healthScore, final DNA dna, final double bankBalance) {
        super(name, age, healthScore, dna, bankBalance);
        this.compatibilityScore = 0.0;
    }

    public double getBankBalance(){
        return bankBalance;
    }

    public double getCompatibilityScore(){
        return compatibilityScore;
    }

    public Career getCareer(){
        return career;
    }

    @Override
    public Location getLocation(){
        return location;
    }

    public void setCompatibilityScore(final double compatibilityScore){
        this.compatibilityScore = compatibilityScore;
    }


    public void setBankBalance(final double bankBalance){
        this.bankBalance = bankBalance;
    }

    public void chooseCareer(final Career career){
        this.career = career;
    }

    public void chooseLocation(final Location location){
        this.location = location;
    }

    @Override
    public String getLifeStage(){
        return "Partner";
    }
}
