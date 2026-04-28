package edu.sandiego.comp305;

public abstract class Person {
    private String name;
    private Age age;
    private int healthScore;
    private String phenotype;


    public Person(String name, Age age, int healthScore, String phenotype) {
        this.name = name;
        this.age = age;
        this.healthScore = healthScore;
        this.phenotype = phenotype;

    }

    public String getName(){
        return null;
    };
    public Age getAge(){
        return null;
    };
    public int getHealthScore(){
        return 0;
    };
    public void setAge(Age age){
    };
    public void setHealthScore(int healthScore){

    };

}
