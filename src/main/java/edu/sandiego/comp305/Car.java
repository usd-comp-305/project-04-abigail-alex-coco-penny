package edu.sandiego.comp305;

public class Car implements Insurable {
    private final int value;

    private final String type;

    private final int year;

    public Car (final int value, final String type, final int year) {
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

    public String getType() {
        return this.type;
    }

    public int getYear() {
        return this.year;
    }
}
