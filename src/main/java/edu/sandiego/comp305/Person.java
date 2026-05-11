package edu.sandiego.comp305;

public abstract class Person {
    final private String name;

    private Age age;

    private int healthScore;

    private DNA dna;

    private double bankBalance;


    public Person(final String name, final Age age, final int healthScore, final DNA dna, final double bankBalance) {
        this.name = name;
        this.age = age;
        this.healthScore = healthScore;
        this.dna = dna;
        this.bankBalance = bankBalance;
    }

    public String getName(){
        return name;
    }

    public Age getAge(){
        return age;
    }

    public int getHealthScore(){
        return healthScore;
    }

    public DNA getDna(){
        return dna;
    }

    public void setAge(final Age age){
        this.age = age;
    }

    public void setHealthScore(final int healthScore){
        this.healthScore = healthScore;
    }

    public abstract String getLifeStage();

    public Location getLocation() {
        return null; }

    public void setBankBalance(final double bankBalance) {
        this.bankBalance = bankBalance;
    }

    public double getBankBalance() {
        return this.bankBalance;
    }

}
