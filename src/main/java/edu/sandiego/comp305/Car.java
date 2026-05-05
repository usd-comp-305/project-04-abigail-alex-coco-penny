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

    Car(int value, String[] type, int year, int baseRate) {
        this.value = value;
        this.type = type;
        this.year = year;
        this.baseRate = baseRate;
    }

    @Override
    public void applyInsurance() {

    }

    @Override
    public double getPremium(Person person) {
        // B = base rate
        //Premium = B(1 + w1F1 + w2F2 + w3F3)
        //F1(value) = cost of car/50,000
        //w1 = 0.3
        //
        //F2 = age of car (year-2000)
        //w2 = 0.5
        //
        //F3 = characters age:
        //16-24 w = 0.8, 70+ w = 0.6, 25-69 w = 0.4
        //
        //premium = baseRate * (1 + costRisk + ageOfCarRisk + ageOfPersonRisk);
        return 0.0;
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
