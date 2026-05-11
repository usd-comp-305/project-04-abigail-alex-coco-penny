package edu.sandiego.comp305;

public class Insurance {

    private double totalPremium;

    public double calculatePremium(final Character character) {
        double premium = 0.0;

        if (character.getCar() != null) {
            premium += character.getCar().getPremium(character);
        }

        this.totalPremium = premium;

        return premium;
    }

    public double getTotalPremium() {
        return this.totalPremium;
    }
}
