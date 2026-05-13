package edu.sandiego.comp305;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GamblingRiskyEventTest {

    private Character person;

    private DNA mockedDNA = mock(DNA.class);

    private Scanner mockedScanner;

    private Random mockedRNG;

    @BeforeEach
    void setUp() {
        person = new Character("Person_1", Age.ADULT, mockedDNA, 0);

        mockedScanner = mock(Scanner.class);

        mockedRNG = mock(Random.class);
    }

    @Test
    void testWinningInGambingAltersBankBalance() {

        final RiskyGamblingEvent riskyGamblingEvent = new RiskyGamblingEvent("Blackjack", 1000, 0.6);

        person.setBankBalance(2000);

        when(mockedScanner.nextLine()).thenReturn("y");

        when(mockedRNG.nextDouble()).thenReturn(0.1);

        riskyGamblingEvent.executeOn(person, mockedScanner, mockedRNG);

        assertEquals(3800, person.getBankBalance());
    }

    @Test
    void testLosingInGambingAltersBankBalance() {

        final RiskyGamblingEvent riskyGamblingEvent = new RiskyGamblingEvent("Blackjack", 1000, 0.6);

        person.setBankBalance(2000);

        when(mockedScanner.nextLine()).thenReturn("y");

        when(mockedRNG.nextDouble()).thenReturn(0.5);

        riskyGamblingEvent.executeOn(person, mockedScanner, mockedRNG);

        assertEquals(1000, person.getBankBalance());
    }

    @Test
    void testNotChoosingToGambleDoesNotAlterBalance() {

        final RiskyGamblingEvent riskyGamblingEvent = new RiskyGamblingEvent("Blackjack", 1000, 0.6);

        person.setBankBalance(2000);

        when(mockedScanner.nextLine()).thenReturn("n");

        when(mockedRNG.nextDouble()).thenReturn(0.1);

        riskyGamblingEvent.executeOn(person, mockedScanner, mockedRNG);

        assertEquals(2000, person.getBankBalance());
    }




}
