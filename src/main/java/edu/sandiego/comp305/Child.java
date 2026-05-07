package edu.sandiego.comp305;

public class Child extends Person {

    private final int parent1HealthScore;

    private final int parent2HealthScore;

    public Child(
            final String name,
            final Age age,
            final int healthScore,
            final DNA dna,
            final Character parent1,
            final Partner parent2) {
        super(name, age, healthScore, dna);
        this.parent1HealthScore = parent1.getHealthScore();
        this.parent2HealthScore = parent2.getHealthScore();
    }

    @Override
    public String getLifeStage(){
        return "Child";
    }


    public void inheritHealthTraits(){
        final int averageHealth = (parent1HealthScore + parent2HealthScore) /2;
        setHealthScore(averageHealth);
    }

}
