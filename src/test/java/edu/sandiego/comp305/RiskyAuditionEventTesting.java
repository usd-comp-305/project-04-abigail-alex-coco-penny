package edu.sandiego.comp305;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class RiskyAuditionEventTesting {

    private Person person;

    private DNA mockedDNA = mock(DNA.class);

    private Scanner mockedScanner;

    private Random mockedRNG;

    @BeforeEach
    void setUp() {
        person = new Character("Person_1", Age.ADULT, 100, mockedDNA, 0);

        mockedScanner = mock(Scanner.class);

        mockedRNG = mock(Random.class);
    }

    @Test
    void testRiskyAuditionGoesWell() {

        final RiskyAuditionEvent riskyAuditionEvent = new RiskyAuditionEvent("Lead", 500, 0.4);

        person.setBankBalance(1000);

        when(mockedScanner.nextLine()).thenReturn("y");

        when(mockedRNG.nextDouble()).thenReturn(0.1);

        riskyAuditionEvent.executeOn(person, mockedScanner, mockedRNG);

        assertEquals(1900, person.getBankBalance());
    }

    @Test
    void testRiskyAuditionGoesBad() {
        final RiskyAuditionEvent riskyAuditionEvent = new RiskyAuditionEvent("Support", 300, 0.4);

        person.setBankBalance(1000);

        when(mockedScanner.nextLine()).thenReturn("y");

        when(mockedRNG.nextDouble()).thenReturn(0.5);

        riskyAuditionEvent.executeOn(person, mockedScanner, mockedRNG);

        assertEquals(700, person.getBankBalance());
    }
}
