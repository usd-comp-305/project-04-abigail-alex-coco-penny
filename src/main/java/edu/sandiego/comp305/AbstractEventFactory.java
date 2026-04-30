package edu.sandiego.comp305;

public interface AbstractEventFactory {

    public FinancialLifeEvent createFinancialEvent();

    public MilestoneLifeEvent createMilestoneEvent();

    public RiskyLifeEvent createRiskyEvent();

}
