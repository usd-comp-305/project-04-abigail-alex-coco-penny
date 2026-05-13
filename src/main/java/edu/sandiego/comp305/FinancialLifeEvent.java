package edu.sandiego.comp305;

import java.util.Random;
import java.util.Scanner;

public interface FinancialLifeEvent {

    public abstract void executeOn(Character person, Scanner scanner, Random random);

}
