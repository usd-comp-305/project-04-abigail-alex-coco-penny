package edu.sandiego.comp305;

import java.util.Random;

public class AdultLifeEventFactory implements EventFactory {

    Random rng =  new Random();

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
