package edu.sandiego.comp305;

public class House implements Insurable {
    private final int value;

    private final int mortgageBalance;

    private final int address;

    public House (final int value, final int mortgageBalance,
                  final int address) {
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
    public double getPremium(Person person) {
        return 0.0;
    }

    public int calculateRiskFactor() {
        return 0; // based on location
    }
}
