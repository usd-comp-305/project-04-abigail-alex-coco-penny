package edu.sandiego.comp305;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Simulator {

    private static final Scanner INPUT = new Scanner(System.in, "UTF-8");

    private static final Random RNG = new Random();
    
    private static final int EARLY_YEARS = 3;

    private static final int TEEN_YEARS = 3;

    private static final int ADULT_YEARS = 5;

    private static final int LATE_YEARS = 3;

    private static final double STARTING_BONUS = 1000;

    private static final double YEARLY_EXPENSES = 5000;

    private Simulator () {
    }

    public static void main(final String[] args) {
        printHeader("Welcome to the Game of Life");

        final Character player = createCharacter();

        pause();

        runEarlyYears(player);

        pause();

        runTeenLife(player);

        pause();

        chooseCareer(player);

        pause();

        runAdultLife(player);

        pause();

        runLateLife(player);

        pause();

        retire(player);

    }

    private static void printHeader(final String header) {
        System.out.println("\n================================================");
        System.out.println("          " + header + "           ");
        System.out.println("================================================");
    }

    public static Character createCharacter(){
        printHeader("Character Creation");

        System.out.println("First, we will begin with your name. Enter it here: ");
        final String name = INPUT.nextLine();
        final Character character = new Character(name, Age.CHILD, DNA.generateRandomDNA(RNG), STARTING_BONUS);

        final Phenotype phenotype = character.getPhenotype();
        System.out.println("Your character has been created! Here are your traits: ");
        System.out.println("Eye Color: " + phenotype.getEyeColor());
        System.out.println("Height: " + phenotype.getHeight());
        System.out.println("Hair Color: " + phenotype.getHairColor());

        System.out.println(
                "Congrats! You earned a Life Starting bonus! Starting bank balance: $"
                        + character.getBankBalance());

        return character;
    }

    public static void runEarlyYears(final Character player){
        player.setAge(Age.CHILD);

        printHeader("Starting Early Life of " + player.getName());

        final EventFactory factory = new EarlyLifeEventFactory();

        for (int year = 1; year <= EARLY_YEARS; year++) {

            printYearHeader(year);

            final RiskyLifeEvent riskyEvent =
                    factory.createRiskyEvent();

            riskyEvent.executeOn(
                    player,
                    INPUT,
                    RNG);

            printYearSummary(player);
        }
    }

    public static void runTeenLife(final Character player){
        player.setAge(Age.YOUNG_ADULT);

        printHeader("Entering Teenage Years of " + player.getName());

        final EventFactory factory = new EarlyLifeEventFactory();

        for (int year = 1; year <= TEEN_YEARS; year++) {

            printYearHeader(year);

            final RiskyLifeEvent riskyEvent =
                    factory.createRiskyEvent();

            riskyEvent.executeOn(
                    player,
                    INPUT,
                    RNG);

            printYearSummary(player);
        }

        System.out.println(
                "\n*** HIGH SCHOOL GRADUATION ***");

        final MilestoneLifeEvent graduation =
                new HighschoolMilestoneEvent();

        graduation.executeOn(player, INPUT, RNG);
    }

    private static void chooseCareer(
            final Character player) {

        printHeader("Career Selection");

        final Career career =
                chooseRandomOption(
                        Career.values(),
                        "Choose Your Career");

        player.chooseCareer(career);

        System.out.println(
                "\nYou selected: "
                        + career.title);

        System.out.println(
                "Yearly Salary: $"
                        + career.salary);
    }

    public static void runAdultLife(final Character player){
        player.setAge(Age.ADULT);

        printHeader("Entering Adult Life of " + player.getName());

        chooseCar(player);

        chooseHouse(player);

        final Partner partner = offerMarriage(player);

        offerChildren(player, partner);

        final EventFactory factory =
                new AdultLifeEventFactory();

        for (int year = 1; year <= ADULT_YEARS; year++) {

            printYearHeader(year);

            applySalary(player);

            applyLivingExpenses(player);

            final RiskyLifeEvent riskyEvent =
                    factory.createRiskyEvent();

            riskyEvent.executeOn(
                    player,
                    INPUT,
                    RNG);

            final FinancialLifeEvent financialEvent =
                    factory.createFinancialEvent();

            financialEvent.executeOn(
                    player,
                    INPUT,
                    RNG);

            printYearSummary(player);

            if (player.getBankBalance() < -50000) {

                System.out.println(
                        "\nYou went bankrupt.");

                return;
            }
        }
    }

    private static void chooseCar(
            final Character player) {

        printHeader("CAR PURCHASE");

        System.out.println(
                "Would you like to buy a car? (y/n)");

        final String choice =
                INPUT.nextLine().toLowerCase();

        if (choice.equals("y")) {

            final Car car =
                    chooseRandomOption(
                            Car.values(),
                            "Choose a Car");

            player.buyCar(car);

            player.setBankBalance(
                    player.getBankBalance()
                            - car.getValue());

            System.out.println(
                    "\nYou bought a "
                            + car.getType()[0]
                            + " "
                            + car.getType()[1]);

            System.out.println(
                    "Cost: $"
                            + car.getValue());
        }
    }

    private static void chooseHouse(
            final Character player) {

        printHeader("HOUSE PURCHASE");

        System.out.println(
                "Would you like to buy a house? (y/n)");

        final String choice =
                INPUT.nextLine().toLowerCase();

        if (choice.equals("y")) {

            final House house =
                    chooseRandomOption(
                            House.values(),
                            "Choose a House");

            player.buyHouse(house);

            player.setBankBalance(
                    player.getBankBalance()
                            - house.getMortgageBalance());

            System.out.println(
                    "\nYou bought: "
                            + house);

            System.out.println(
                    "Mortgage Cost: $"
                            + house.getMortgageBalance());
        }
    }

    private static Partner offerMarriage(
            final Character player) {

        printHeader("MARRIAGE");

        System.out.println(
                "Would you like to get married? (y/n)");

        final String choice =
                INPUT.nextLine().toLowerCase();

        if (choice.equals("y")) {

            System.out.println("Enter your partner's name: ");
            final String partnerName = INPUT.nextLine();

            final Partner partner = new Partner(
                    partnerName,
                    Age.ADULT,
                    DNA.generateRandomDNA(RNG),
                    0.0
            );

            partner.chooseCareer(
                    chooseRandomOption(
                            Career.values(),
                            "Choose Partner's Career"
                    )
            );

            partner.chooseLocation(
                    chooseRandomOption(
                            Location.values(),
                            "Choose Partner's Location"
                    )
            );

            partner.calculateBankBalance();

            final Phenotype partnerPhenotype = partner.getPhenotype();
            System.out.println("\nYour partner has been created! Here are their traits");
            System.out.println("Eye Color: " + partnerPhenotype.getEyeColor());
            System.out.println("Height: " + partnerPhenotype.getHeight());
            System.out.println("Hair Color: " + partnerPhenotype.getHairColor());
            System.out.println("Career: " + partner.getCareer().title);
            System.out.println("\nCongratulations on your marriage!");

            return partner;
        }

        return null;
    }

    private static void offerChildren(
            final Character player, final Partner partner) {

        printHeader("CHILDREN");

        System.out.println(
                "Would you like to have a child? (y/n)");

        final String choice =
                INPUT.nextLine().toLowerCase();

        if (choice.equals("y")) {

            //if player declined marriage, default partner is created
            // so Child constructor still has two parents
            final Partner childParent = partner != null ? partner :
                    new Partner(
                            "Parent 2",
                            Age.ADULT,
                            DNA.generateRandomDNA(RNG),
                            0.0
                    );

            System.out.println("Enter your child's name: ");
            final String childName = INPUT.nextLine();

            final Child child = new Child(
                    childName,
                    Age.CHILD,
                    DNA.generateRandomDNA(RNG),
                    player,
                    childParent,
                    0.0
            );

            child.inheritDNATraits(RNG);

            System.out.println(
                    "Would you like your child to go to college? (y/n)");
            final String collegeChoice = INPUT.nextLine().toLowerCase();
            child.setWentToCollege(collegeChoice.equals("y"));

            final Phenotype childPhenotype = child.getPhenotype();
            System.out.println("\nYour child has been created! Here are their traits:");
            System.out.println("Eye Color: " + childPhenotype.getEyeColor());
            System.out.println("Height: " + childPhenotype.getHeight());
            System.out.println("Hair Color: " + childPhenotype.getHairColor());
            System.out.println("Went to College: " + child.getWentToCollege());

            System.out.println(
                    "\nCongratulations on your child!");
        }
    }

    private static void retire(
            final Character player) {

        printHeader("RETIREMENT");

        double retirementBonus = 0;

        if (player.getCareer() != null) {

            retirementBonus +=
                    player.getCareer().salary * 0.25;
        }

        player.setBankBalance(
                player.getBankBalance()
                        + retirementBonus);

        System.out.println(
                "Name: "
                        + player.getName());

        System.out.println(
                "Final Career: "
                        + player.getCareer().title);

        System.out.println(
                "Retirement Bonus: $"
                        + retirementBonus);

        System.out.println(
                "Final Bank Balance: $"
                        + player.getBankBalance());

        if (player.getCar() != null) {

            System.out.println(
                    "Car Owned: "
                            + Arrays.toString(
                            player.getCar().getType()));
        }

        if (player.getHouse() != null) {

            System.out.println(
                    "House Owned: "
                            + player.getHouse());
        }

        System.out.println(
                "\nThank you for playing!");
    }

    public static void runLateLife(final Character player){
        player.setAge(Age.SENIOR);

        printHeader("Entering Later Life of " + player.getName());

        final EventFactory factory =
                new AdultLifeEventFactory();

        for (int year = 1; year <= LATE_YEARS; year++) {

            printYearHeader(year);

            applySalary(player);

            applyLivingExpenses(player);

            final FinancialLifeEvent financialEvent =
                    factory.createFinancialEvent();

            financialEvent.executeOn(
                    player,
                    INPUT,
                    RNG);

            printYearSummary(player);
        }
    }


    private static void applySalary(
            final Character player) {

        if (player.getCareer() != null) {

            player.setBankBalance(
                    player.getBankBalance()
                            + player.getCareer().salary);

            System.out.println(
                    "\nSalary Earned: $"
                            + player.getCareer().salary);
        }
    }

    private static void printYearHeader(
            final int year) {

        System.out.println(
                "\n---------------- YEAR "
                        + year
                        + " ----------------");
    }

    private static void printYearSummary(
            final Character player) {

        System.out.println(
                "\nCurrent balance: $"
                        + player.getBankBalance());

        if (player.getCareer() != null) {

            System.out.println(
                    "Career: "
                            + player.getCareer().title);
        }
    }


    private static void applyLivingExpenses(
            final Character player) {

        player.setBankBalance(
                player.getBankBalance()
                        - YEARLY_EXPENSES);

        System.out.println(
                "Living Expenses Paid: $"
                        + YEARLY_EXPENSES);
    }

    private static void pause() {

        System.out.println(
                "\nPress ENTER to continue...");

        INPUT.nextLine();
    }

    public static void printRetirementSummary(final Character player) {

        printHeader("You have reached retirement!");

        System.out.println(
                "Name: "
                        + player.getName());

        System.out.println(
                "Final Balance: $"
                        + player.getBankBalance());

        if (player.getCareer() != null) {

            System.out.println(
                    "Career: "
                            + player.getCareer().title);
        }

        System.out.println(
                "\nThank you for playing!");
    }

    private static <T> T chooseRandomOption(
            final T[] values,
            final String title) {

        final T[] copy =
                Arrays.copyOf(values, values.length);

        Collections.shuffle(
                Arrays.asList(copy));

        System.out.println("\n" + title);

        for (int i = 0; i < 3; i++) {

            System.out.println(
                    (i + 1)
                            + ". "
                            + copy[i]);
        }

        int choice = 0;

        while (choice < 1 || choice > 3) {

            System.out.println(
                    "\nEnter choice (1-3):");

            try {

                choice =
                        Integer.parseInt(
                                INPUT.nextLine());

            } catch (NumberFormatException e) {

                choice = 0;
            }
        }

        return copy[choice - 1];
    }
}


