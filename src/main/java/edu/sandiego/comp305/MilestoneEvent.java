package edu.sandiego.comp305;

import java.util.ArrayList;

public class MilestoneEvent extends Event {

    MilestoneType milestoneType;

    public MilestoneEvent (MilestoneType milestoneType, int riskFactor, ArrayList<Age> validAges) {
        super(riskFactor, validAges);
        this.milestoneType = milestoneType;
    }

    @Override
    public void execute(Person person) {

    }

}
