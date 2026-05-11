package edu.sandiego.comp305;

public class UnexpectedBillEvent implements FinancialLifeEvent {

    private String description;
    private double cost;

    public UnexpectedBillEvent(String description, double cost) {
        this.description = description;
        this.cost = cost;
    }

    @Override
    public void executeOn(Person person) {
        System.out.println("Unexpected Bill: " + description);
        System.out.println("You must pay $" + cost);
        person.setBankBalance(person.getBankBalance() -  this.cost);
    }
}
