package edu.sandiego.comp305;

public class AdultLifeEventFactory implements AbstractEventFactory {

    @Override
    public FinancialLifeEvent createFinancialEvent() {

        return new FinancialAdultLifeEvent();
    }

    public MilestoneLifeEvent createMilestoneEvent() {
        return new MilestoneAdultLifeEvent();
    }

    public RiskyLifeEvent createRiskyEvent() {
        return new RiskyAdultLifeEvent();
    }



}
