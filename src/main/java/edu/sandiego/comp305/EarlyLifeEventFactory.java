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

        }

        return null;

    }

    public MilestoneLifeEvent createMilestoneEvent(final Random rng) {
        return new HighschoolMilestoneEvent();
    }

    public RiskyLifeEvent createRiskyEvent(final Random rng) {
        final int randInt = rng.nextInt(6) + 1;

        switch (randInt) {

            case 1:
                return new RiskyAuditionEvent("Lead", 1000, 0.3);

            case 2:
                return new SportsPlayingRiskyEvent("Basketball", 50, 0.8);
            case 3:
                return new NeighborhoodBusinessEvent("Lemonade Stand", 200, 0.2);

            case 4:
                return new SportsPlayingRiskyEvent("Soccer", 100, 0.2);
            case 5:
                return new NeighborhoodBusinessEvent("Window Cleaning", 300, 0.8);
            case 6:
                return new RiskyAuditionEvent("Supporting Role", 500, 0.7);
        }

        return null;

    }



}
