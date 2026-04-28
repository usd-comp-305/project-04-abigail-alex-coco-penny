package edu.sandiego.comp305;

public abstract class Person {
    protected String name;
    protected int age;
    protected int healthScore;
    protected String phenotype;


    public Person(String name, int age, int healthScore, String phenotype) {
        this.name = name;
        this.age = age;
        this.healthScore = healthScore;
        this.phenotype = phenotype;

    }
    }

    public String getName(){
        return null;
    }
    public int getAge(){
        return 0;
    }
    public int getHealthScore(){
        return 0;
    }
    public void setAge(int age){
    }
    public void setHealthScore(int score){}

}
