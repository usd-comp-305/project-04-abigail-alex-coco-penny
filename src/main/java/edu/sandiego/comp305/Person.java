package edu.sandiego.comp305;

public abstract class Person {
    final private String name;

    private Age age;

    private DNA dna;

    private double bankBalance;


    public Person(final String name, final Age age, final DNA dna, final double bankBalance) {
        this.name = name;
        this.age = age;
        this.dna = dna;
        this.bankBalance = bankBalance;
    }

    public String getName(){
        return name;
    }

    public Age getAge(){
        return age;
    }

    public DNA getDna(){
        return dna;
    }

    public double getBankBalance() {
        return this.bankBalance;
    }


    public void setAge(final Age age){
        this.age = age;
    }

    public void setDNA(final DNA dna){
        this.dna = dna;
    }

    public void setBankBalance(final double bankBalance) {
        this.bankBalance = bankBalance;
    }

    public abstract String getLifeStage();

    public Location getLocation() {
        return null; }

    public Phenotype getPhenotype() {
        return null;
    }

}
