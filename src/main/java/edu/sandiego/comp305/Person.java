package edu.sandiego.comp305;

public abstract class Person {
    private String name;
    private Age age;
    private int healthScore;


    public Person(String name, Age age, int healthScore) {
        this.name = name;
        this.age = age;
        this.healthScore = healthScore;

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
