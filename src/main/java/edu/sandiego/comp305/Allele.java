package edu.sandiego.comp305;

public enum Allele {
    EYE_COLOR ("brown", "blue"),
    HEIGHT ("tall", "short"),
    HAIR_COLOR ("brown", "blonde");

    private final String dominantTrait;

    private final String recessiveTrait;

    Allele(final String dominantTrait, final String recessiveTrait) {
        this.dominantTrait = dominantTrait;
        this.recessiveTrait = recessiveTrait;
    }

    public String getDominantTrait() {
        return dominantTrait;
    }

    public String getRecessiveTrait() {
        return recessiveTrait;
    }
}
