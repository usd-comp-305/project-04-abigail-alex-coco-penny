package edu.sandiego.comp305;

import java.util.Scanner;

public class InvestmentOpportunityEvent implements FinancialLifeEvent {

    private String description;
    private double cost;

    public InvestmentOpportunityEvent(String description, double cost) {
        this.description = description;
        this.cost = cost;
    }


    @Override
    public void executeOn(Person person, Scanner scanner) {
        System.out.println("Investment Opportunity: " + description);
        System.out.println("Would you like to invest $" + cost + "? (y/n) \n");

        String investmentChoice = scanner.nextLine().toLowerCase();

        if(investmentChoice.equals("y")) {
            System.out.println("$" + cost  + " have successfully been invested!\n");
            person.setBankBalance(person.getBankBalance() - cost);
        }
        else {
            System.out.println("$" + cost + " was not invested.\n");
        }

    }
}
