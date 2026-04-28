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

    public abstract String getName();
    public abstract int getAge();
    public abstract int getHealthScore();
    public abstract void setAge(int age);
    public abstract void setHealthScore(int score);

}
