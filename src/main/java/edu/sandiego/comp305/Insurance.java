package edu.sandiego.comp305;

public class Insurance {

    private double totalPremium;

    public void calculatePremium(final Character character) {
        double premium = 0.0;

        for (Insurable insurable : character.getInsurables()) {
            premium += insurable.calculatePremium(character);
        }

        this.totalPremium = premium;
    }

    public double getTotalPremium() {
        return this.totalPremium;
    }
}
