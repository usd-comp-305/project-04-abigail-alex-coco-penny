package edu.sandiego.comp305;

public enum Car implements Insurable {
    MICRO (4995, new String[]{"Smart", "Fortwo"}, 2015),
    HATCHBACK (6750, new String[]{"Honda", "Fit"}, 2008),
    SEDAN (18585, new String[]{"Nissan", "Versa"}, 2024),
    SUV (16749, new String[]{"Subaru", "Outback"},2018 ),
    SPORT (36998, new String[]{"Jaguar", "F-Type P300"}, 2020),
    PICK_UP (24495, new String[]{"Chevorlet", "Silverado"}, 2021),
    LIMO (110000, new String[]{"Rolls Royce", "Ghost Exotic"}, 2004),
    VAN (61545, new String[]{"Volkswagen", "Microbus"}, 2025),
    CONVERTIBLE (7888, new String[]{"BMW", "328i"}, 2010),
    WAGON (12998, new String[]{"Volkswagen", "Golf"}, 2016);

    public final int value;
    public final String[] type;
    public final int year;

    Car(int value, String[] type, int year) {
        this.value = value;
        this.type = type;
        this.year = year;
    }

    @Override
    public void applyInsurance() {
    }

    @Override
    public double getPremium() {
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
