package edu.sandiego.comp305;

public class House implements Insurable {
    private final int value;
    private final int mortgageBalance;
    private final int address;

    public House (int value, int mortgageBalance, int address) {
        this.value = value;
        this.mortgageBalance = mortgageBalance;
        this.address = address;
    }

    public int getValue() {
        return this.value;
    }

    public int getMortgageBalance() {
        return this.mortgageBalance;
    }

    public int getAddress() {
        return this.address;
    }

    @Override
    public void applyInsurance() {

    }

    @Override
    public double getPremium() {
        return 0.0;
    }

    public int calculateRiskFactor() {
        return 0; // based on location
    }
}
