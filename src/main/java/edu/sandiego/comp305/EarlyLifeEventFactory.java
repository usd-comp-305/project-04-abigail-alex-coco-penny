package edu.sandiego.comp305;

import java.util.Random;

public class EarlyLifeEventFactory implements EventFactory {


    public FinancialLifeEvent createFinancialEvent(final Random rng) {

        final int randInt = rng.nextInt(3) + 1;

        switch (randInt) {

            case 1:
                return new SellValuableEvent("Gold Money Clip", 300, 0.8);

            case 2:
                return new FirstPaycheckEvent( 300);

            case 3:
                return new UnexpectedBillEvent("Cell Service Bill", 100);
        }

        return null;

    }

    public MilestoneLifeEvent createMilestoneEvent(final Random rng) {
        return new HighschoolMilestoneEvent();
    }

    public RiskyLifeEvent createRiskyEvent(final Random rng) {
        final int randInt = rng.nextInt(2) + 1;

        switch (randInt) {

            case 1:
                return new RiskyAuditionEvent("Lead", 5000, 0.6);

            case 2:
                return new SportsPlayingRiskyEvent("Basketball", 50, 0.8);
        }

        return null;

    }



}
