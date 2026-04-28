package edu.sandiego.comp305;

import java.util.ArrayList;

public class RiskyEvent extends Event {

    double successRate;
    int healthImpact;
    int financialImpact;

    public RiskyEvent(double riskFactor, ArrayList<Age> validAges, double successRate, int healthImpact, int financialImpact) {
        super(riskFactor, validAges);
        this.successRate = successRate;
        this.healthImpact = healthImpact;
        this.financialImpact = financialImpact;
    }

    @Override
    public void execute(Person person) {
        return;
    }


}

