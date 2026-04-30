package edu.sandiego.comp305;

public class Insurance {
    private final Car car;

    private final House house;

    public Insurance (final Car car, final House house) {
        this.car = car;
        this.house = house;
    }

    public void handleCarEvent(final double damageCost) {}

    public void handleHouseEvenet(final double damageCost) {}

    // combines car and house premiums, this will be paid annually
    public double calculateTotalPremium() {
        return 0.0;
    }

}
