package edu.sandiego.comp305;

public enum House implements Insurable {
    APARTMENT (250000, 180000),
    SUBURBAN_HOME (450000, 320000),
    CONDO (350000, 240000),
    MANSION (2500000, 1800000),
    CASTLE (5000000, 3500000),
    COTTAGE (175000, 120000),
    MOBILE_HOME (95000, 65000),
    TREE_HOUSE (40000, 15000),
    HUT (25000, 10000),
    HOUSE_BOAT (220000, 150000);

    private final int value;

    private final int mortgageBalance;

    private static final double VALUE_WEIGHT = 500000.0;

    private static final double BASE_RATE = 1000;

    House (final int value, final int mortgageBalance) {
        this.value = value;
        this.mortgageBalance = mortgageBalance;
    }

    public int getValue() {
        return this.value;
    }

    public int getMortgageBalance() {
        return this.mortgageBalance;
    }

    @Override
    public double calculatePremium(final Person person) {
        final double valueRisk = this.value / VALUE_WEIGHT;
        final double mortgageRisk = this.mortgageBalance / (double) this.value;
        final double ageRisk = person.getAge().getRiskFactor();
        final double locationRisk = person.getLocation().getRiskFactor();

        return BASE_RATE * (1 + valueRisk + mortgageRisk + ageRisk + locationRisk);
    }

}
