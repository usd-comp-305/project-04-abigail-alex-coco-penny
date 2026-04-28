package edu.sandiego.comp305;

public abstract class Event {

    String description;
    double riskFactor;
    ArrayList<Age> validAges;

    public Event(String description, double riskFactor, ArrayList<Age> validAges) {
        this.description = description;
        this.riskFactor = riskFactor;
        this.validAges = validAges;
    }

    public abstract void execute();


}
