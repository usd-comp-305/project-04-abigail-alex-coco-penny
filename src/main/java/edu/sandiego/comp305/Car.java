package edu.sandiego.comp305;

public enum Car implements Insurable {
    MICRO (4995, new String[]{"Smart", "Fortwo"}, 2015, 24),
    HATCHBACK (6750, new String[]{"Honda", "Fit"}, 2008, 26),
    SEDAN (18585, new String[]{"Nissan", "Versa"}, 2024, 28),
    SUV (16749, new String[]{"Subaru", "Outback"},2018, 31),
    SPORT (36998, new String[]{"Jaguar", "F-Type P300"}, 2020, 45),
    PICK_UP (24495, new String[]{"Chevorlet", "Silverado"}, 2021, 32),
    LIMO (110000, new String[]{"Rolls Royce", "Ghost Exotic"}, 2004, 50),
    VAN (61545, new String[]{"Volkswagen", "Microbus"}, 2025, 29),
    CONVERTIBLE (7888, new String[]{"BMW", "328i"}, 2010, 36),
    WAGON (12998, new String[]{"Volkswagen", "Golf"}, 2016, 27);

    public final int value;

    public final String[] type;

    public final int year;

    public final int baseRate;

    Car(final int value, final String[] type, final int year, final int baseRate) {
        this.value = value;
        this.type = type;
        this.year = year;
        this.baseRate = baseRate;
    }

    @Override
    public void applyInsurance() {

    }

    @Override
    public double getPremium(final Person person) {
        double WEIGHT1 = 0.5;
        final double yearRisk = WEIGHT1 * (this.year - 2000);
        double WEIGHT2 = 0.3;
        final double valueRisk = WEIGHT2 * (this.value / 50000.0);
        final double ageRisk = person.getAge().riskFactor;

        return this.baseRate * (1 + yearRisk + valueRisk + ageRisk);
    }

    public int getValue() {
        return this.value;
    }

    public String[] getType() {
        return this.type;
    }

    public int getYear() {
        return this.year;
    }
}
