package edu.sandiego.comp305;

import java.util.Random;
import java.util.Scanner;

public class HighschoolMilestoneEvent implements MilestoneLifeEvent {

    private String description;

    private double cost;

    public HighschoolMilestoneEvent() {
    }

    @Override
    public void executeOn(final Person person, final Scanner scanner, final Random RNG) {


        System.out.println("Congratulations! You have graduated High School!\nYour parents have awarded you $5000 for college funds.");
        person.setBankBalance(person.getBankBalance() + 5000);



    }
}
