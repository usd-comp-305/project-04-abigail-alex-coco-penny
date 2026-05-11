package edu.sandiego.comp305;


import java.util.Random;

public class AdultLifeEventFactory implements EventFactory {

    private Random random = new Random();

    @Override
    public FinancialLifeEvent createFinancialEvent() {

        final int randInt = random.nextInt(3) + 1;

        switch (randInt) {

            case 1:
                return new InvestmentOpportunityEvent("Friend's Startup", 10000, 0.75);

            case 2:
                return new InvestmentOpportunityEvent("Government Bonds", 7500, 0.5);

            case 3:
                return new InvestmentOpportunityEvent("Real Estate", 100000, 0.3);
        }

        return null;



    }

    public MilestoneLifeEvent createMilestoneEvent() {
        final int randInt = random.nextInt(3) + 1;

        switch (randInt) {

            case 1:
                return new RetirementMilestoneEvent();

            case 2:
                return null;
            case 3:
                return null;
        }

        return null;
    }

    public RiskyLifeEvent createRiskyEvent() {

        final int randInt = random.nextInt(3) + 1;

        switch (randInt) {

            case 1:
                return new RiskyStartUpEvent("Tech Startup", 50000, 0.6);

            case 2:
                return new RiskyStartUpEvent("Restaurant", 100000, 0.8);
            case 3:
                return new RiskyStartUpEvent("New App", 15000, 0.3);
        }

        return null;

    }



}
