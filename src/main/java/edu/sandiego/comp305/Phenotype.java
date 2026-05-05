package edu.sandiego.comp305;

public class Phenotype {

    private final String eyeColor;
    private final String height;
    private final String hairColor;

    public Phenotype (String eyeColor, String height, String hairColor) {
        this.eyeColor = eyeColor;
        this.height = height;
        this.hairColor = hairColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public String getHeight() {
        return height;
    }

    public String getHairColor() {
        return hairColor;
    }

}
