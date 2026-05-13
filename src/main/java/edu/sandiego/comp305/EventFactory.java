package edu.sandiego.comp305;

import java.util.Random;

public interface EventFactory {

    public abstract FinancialLifeEvent createFinancialEvent(Random rng);

    public abstract MilestoneLifeEvent createMilestoneEvent(Random rng);

    public abstract RiskyLifeEvent createRiskyEvent(Random rng);

}
