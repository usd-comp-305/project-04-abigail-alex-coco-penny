package edu.sandiego.comp305;

public enum Career {

    SURGEON("Doctor", 300000, 55),
    TEACHER("Teacher",70000,70),
    ENGINEER("Engineer", 150000, 58),
    CHEF("Chef", 60000, 56 ),
    ARTIST("Artist", 40000, 79),
    ACCOUNTANT("Accountant", 100000, 60),
    DESIGNER("Designer", 55000, 81),
    ATHLETE("Athlete", 1000000, 45),
    LAWYER("Lawyer", 90000, 63),
    ENTERTAINER("Entertainer", 99000, 43);

    public final String title;
    public final int salary;
    public final int retirementAge;

    Career (String title, int salary, int retirementAge) {
        this.title = title;
        this.salary = salary;
        this.retirementAge = retirementAge;
    }
}
