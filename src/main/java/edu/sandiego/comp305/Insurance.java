package edu.sandiego.comp305;

public class Insurance {
    private final Car car;
    private final House house;

    public Insurance (Car car, House house) {
        this.car = car;
        this.house = house;
    }

    public void handleCarEvent(double damageCost) {}

    public void handleHouseEvenet(double damageCost) {}

    public double calculateTotalPremium() {
        return 0.0; // combines car and house premiums, this will be paid annually
    }

}
