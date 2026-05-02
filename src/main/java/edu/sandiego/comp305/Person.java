package edu.sandiego.comp305;

public abstract class Person {
    private String name;
    private Age age;
    private int healthScore;
    private DNA dna;


    public Person(String name, Age age, int healthScore, DNA dna) {
        this.name = name;
        this.age = age;
        this.healthScore = healthScore;
        this.dna = dna;

    }

    public String getName(){
        return null;
    }
    public Age getAge(){
        return null;
    }
    public int getHealthScore(){
        return 0;
    }
    public void setAge(Age age){
    }
    public void setHealthScore(int healthScore){
    }
    public abstract String getLifeStage();

}
