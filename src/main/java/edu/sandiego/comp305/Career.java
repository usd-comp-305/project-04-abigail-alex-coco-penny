package edu.sandiego.comp305;

public enum Career {

    //example careers to implement
    //DOCTOR("Doctor", 300000, 60);

    private final String title;
    private final int salary;
    private final int retirementAge;

    public Career (String title, int salary, int retirementAge) {
        this.title = title;
        this.salary = salary;
        this.retirementAge = retirementAge;
    }

    public String getTitle() {
        return title;
    }

    public int getSalary() {
        return salary;
    }

    public int getRetirementAge() {
        return retirementAge;
    }

}
