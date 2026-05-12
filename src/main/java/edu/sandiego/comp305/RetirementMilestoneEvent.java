package edu.sandiego.comp305;

import java.util.Random;
import java.util.Scanner;

public class RetirementMilestoneEvent implements MilestoneLifeEvent {



    public RetirementMilestoneEvent() {
    }

    @Override
    public void executeOn(final Person person, final Scanner scanner, final Random random) {
        System.out.println("--- MILESTONE: Retirement ---");

        // I think here we could add a retirement bonus to start. Then we see if the child went to college (add this to the child class), we add that multiplier).
        // If the child went to college, the multiplier will be larger for the retirement bonus.

        // Here we will print: name, went to college, married, child's name, house, location, and phenotype as well as their final balance with the bonus

        // want to put number of kids that the person has as a life stat, as well as money. then, depending on
        // how many kids that they had and how many of them went to college, that will add to the multiplier for a
        // retirement bonus. then we can say the total final amount and reset the character.

        System.out.println("LIFE STATS:\n ");

    }


}
