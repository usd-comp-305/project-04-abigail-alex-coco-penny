package edu.sandiego.comp305;

public abstract class Person {
    final private String name;

    private Age age;

    private int healthScore;

    final private String phenotype;


    public Person(final String name,
                  final Age age,
                  final int healthScore,
                  final String phenotype) {

        this.name = name;
        this.age = age;
        this.healthScore = healthScore;
        this.phenotype = phenotype;

    }

    public String getName(){
        return this.name;
    }

    public Age getAge() {
        return this.age;
    }

    public int getHealthScore() {
        return this.healthScore;
    }

    public String getPhenotype() {
        return this.phenotype;
    }

    public void setAge(final Age age) {
        this.age = age;
    }

    public void setHealthScore(final int healthScore) {
        this.healthScore = healthScore;
    }

    public abstract String getLifeStage();

}
