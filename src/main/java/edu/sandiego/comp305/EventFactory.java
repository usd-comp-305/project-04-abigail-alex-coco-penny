package edu.sandiego.comp305;

public interface EventFactory {

    public abstract FinancialLifeEvent createFinancialEvent();

    public abstract MilestoneLifeEvent createMilestoneEvent();

    public abstract RiskyLifeEvent createRiskyEvent();

}
