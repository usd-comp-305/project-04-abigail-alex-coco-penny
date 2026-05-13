package edu.sandiego.comp305;

import java.util.Random;
import java.util.Scanner;

public class FirstPaycheckEvent implements FinancialLifeEvent {

    double paycheckAmount;

    public FirstPaycheckEvent(final double paycheckAmount) {
        this.paycheckAmount = paycheckAmount;
    }


    @Override
    public void executeOn(final Character person, final Scanner scanner, final Random random) {
        System.out.println("Congratulations! You have received your first paycheck");
        System.out.println("Total Amount: $" + paycheckAmount);

        person.setBankBalance(person.getBankBalance() + paycheckAmount);
    }
}
