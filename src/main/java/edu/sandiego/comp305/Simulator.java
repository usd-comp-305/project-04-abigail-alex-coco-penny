package edu.sandiego.comp305;

import java.util.Random;
import java.util.Scanner;

public class Simulator {

    private static final Scanner INPUT = new Scanner(System.in, "UTF-8");

    private static final Random RNG = new Random();

    private Simulator () {
    }

    public static void main(final String[] args) {
        System.out.println("=========================================");
        System.out.println("       Welcome to the Game of Life       ");
        System.out.println("=========================================");

        final Character player = createCharacter();
        System.out.println("Hit Enter to being your early life: ");
        INPUT.nextLine();
        runEarlyLife(player);

    }

    public static Character createCharacter(){
        System.out.println("First, we will being with your name. Enter it here: ");
        final String name = INPUT.nextLine();
        final Character character = new Character(name, Age.CHILD, 100, DNA.generateRandomDNA(RNG));

        System.out.println("Your character has been created! Here are your traits: ");
        //need to add a getPhenotype to the PERSON class
        return character;
    }

    public static void runEarlyLife(final Character player){
        System.out.println("=========================================");
        System.out.println("      Starting Early Life of " + player.getName());
        System.out.println("=========================================");
    }
}
