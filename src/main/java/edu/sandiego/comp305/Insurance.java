package edu.sandiego.comp305;

public class Insurance {

    private double totalPremium;

    public void calculatePremium(final Character character) {
        double premium = 0.0;

        if (character.getCar() != null) {
            premium += character.getCar().getPremium(character);
        }

        if (character.getHouse() != null) {
            premium += character.getHouse().getPremium(character);
        }

        this.totalPremium = premium;
    }

    public double getTotalPremium() {
        return this.totalPremium;
    }
}
