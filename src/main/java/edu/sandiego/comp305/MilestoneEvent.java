package edu.sandiego.comp305;

public class MilestoneEvent {

    String milestoneType;

    public MilestoneEvent(String description, double riskFactor, ArrayList<Age> validAges, String milestoneType) {
        super(description, riskFactor, validAges);
        this.milestoneType = milestoneType;
    }

}
