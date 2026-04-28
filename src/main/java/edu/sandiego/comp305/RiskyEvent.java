package edu.sandiego.comp305;

public class RiskyEvent {

    double successRate;
    int healthImpact;
    int financialImpact;

    public RiskyEvent(String description, double riskFactor, ArrayList<Age> validAges, double successRate, int healthImpact, int financialImpact) {
        super(description, riskFactor, validAges);
        this.successRate = successRate;
        this.healthImpact = healthImpact;
        this.financialImpact = financialImpact;
    }

    @Override
    public void execute(Person person) {
        return;
    }


}

