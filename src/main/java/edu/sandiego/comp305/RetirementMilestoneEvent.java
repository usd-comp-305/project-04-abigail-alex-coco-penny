package edu.sandiego.comp305;

import java.util.Random;
import java.util.Scanner;

public class RetirementMilestoneEvent implements MilestoneLifeEvent {



    public RetirementMilestoneEvent() {
    }

    @Override
    public void executeOn(final Person person, final Scanner scanner, final Random random) {
        System.out.println("--- MILESTONE: Retirement ---");

        // want to put number of kids that the person has as a life stat, as well as money. then, depending on
        // how many kids that they had and how many of them went to college, that will add to the multiplier for a
        // retirement bonus. then we can say the total final amount and reset the character.

        System.out.println("LIFE STATS:\n ");

    }


}
