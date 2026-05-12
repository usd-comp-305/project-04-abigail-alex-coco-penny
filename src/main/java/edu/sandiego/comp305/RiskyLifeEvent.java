package edu.sandiego.comp305;

import java.util.Random;
import java.util.Scanner;

public interface RiskyLifeEvent {

    public abstract void executeOn(final Person person, final Scanner scanner, final Random random);
}
