package edu.sandiego.comp305;

public abstract class Person {
    final private String name;

    final private Age age;

    final private int healthScore;

    final private String phenotype;


    public Person(final String name, final Age age, int healthScore, final String phenotype) {
        this.name = name;
        this.age = age;
        this.healthScore = healthScore;
        this.phenotype = phenotype;

    }

    public String getName(){
        return null;
    }
    public Age getAge() {
        return null;
    }
    public int getHealthScore() {
        return 0;
    }
    public String getPhenotype() {
        return null;
    }
    public void setAge(final Age age) {
        return;
    }
    public void setHealthScore(final int healthScore) {
        return;
    }
    public abstract String getLifeStage();

}
