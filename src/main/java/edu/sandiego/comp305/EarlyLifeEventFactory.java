package edu.sandiego.comp305;

import java.util.Random;

public class EarlyLifeEventFactory implements EventFactory {

    private Random random = new Random();

    public FinancialLifeEvent createFinancialEvent() {

        final int randInt = random.nextInt(3) + 1;

        switch (randInt) {

            case 1:
                return new UnexpectedBillEvent("Vet Bill", 500);

            case 2:
                return new FirstPaycheckEvent( 300);

            case 3:
                return new UnexpectedBillEvent("Cell Service Bill", 100);
        }

        return null;

    }

    public MilestoneLifeEvent createMilestoneEvent() {
        return new HighschoolMilestoneEvent();
    }

    public RiskyLifeEvent createRiskyEvent() {
        final int randInt = random.nextInt(3) + 1;

        switch (randInt) {

            case 1:
                return new RiskyAuditionEvent("Lead", 5000, 0.3);

            case 2:
                return new RiskyAuditionEvent("Support", 2500, 0.6);

            case 3:
                return new SportsPlayingRiskyEvent("Basketball", 50, 0.2);
        }

        return null;

    }



}
