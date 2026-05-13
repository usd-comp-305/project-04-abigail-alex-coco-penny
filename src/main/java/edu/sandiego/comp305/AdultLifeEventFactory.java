package edu.sandiego.comp305;


import java.util.Random;

public class AdultLifeEventFactory implements EventFactory {

    @Override
    public FinancialLifeEvent createFinancialEvent(final Random rng) {

        final int randInt = rng.nextInt(3) + 1;

        switch (randInt) {

            case 1:
                return new InvestmentOpportunityEvent("Friend's Startup", 10000, 0.75);

            case 2:
                return new InvestmentOpportunityEvent("Government Bonds", 7500, 0.5);

            case 3:
                return new InvestmentOpportunityEvent("Real Estate", 100000, 0.3);
            case 4:
                return new UnexpectedBillEvent("Vet Bill", 1000);
            case 5:
                return new UnexpectedBillEvent("Utilities Bill", 300);
            case 6:
                return new UnexpectedBillEvent("Cell Service Bill", 200);
        }

        return null;



    }

    public MilestoneLifeEvent createMilestoneEvent(final Random rng) {
        final int randInt = rng.nextInt(3) + 1;

        switch (randInt) {

            case 1:
                return new BuyingHouseMilestoneEvent();
            case 2:
                return new MarriageMilestoneEvent();
        }

        return null;
    }

    public RiskyLifeEvent createRiskyEvent(final Random rng) {

        final int randInt = rng.nextInt(5) + 1;

        switch (randInt) {

            case 1:
                return new RiskyStartUpEvent("Tech Startup", 50000, 0.9);

            case 2:
                return new RiskyStartUpEvent("Restaurant", 100000, 0.8);
            case 3:
                return new RiskyGamblingEvent("Blackjack", 1000, 0.6);

            case 4:
                return new RiskyGamblingEvent("Poker", 5000, 0.9);
            case 5:
                return new RiskyGamblingEvent("Baccarat", 3000, 0.7)
        }

        return null;

    }



}
