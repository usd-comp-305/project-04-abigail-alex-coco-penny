package edu.sandiego.comp305;

public class FinancialEvent extends Event {

    double cost;

    public FinancialEvent(String description, double riskFactor, ArrayList<Age> validAges, double cost) {
        super(description, riskFactor, validAges);
        this.cost = cost;
    }

    public void payBill() {
        return;
    }

    public void updateBalance() {
        return;
    }

    @Override
    public void execute() {
        return;
    }
}
