package edu.sandiego.comp305;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SellValuableEventTest {

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
    void testSellValuableEventDoesntIncurLosses() {

        final SellValuableEvent sellValuableEvent = new SellValuableEvent("Gold Money Clip", 300, 0.8);

        person.setBankBalance(1000);

        when(mockedScanner.nextLine()).thenReturn("y");

        when(mockedRNG.nextDouble()).thenReturn(0.1);

        sellValuableEvent.executeOn(person, mockedScanner, mockedRNG);

        assertEquals(1300, person.getBankBalance());
    }

    @Test
    void testSellValuableIncursLosses() {

        final SellValuableEvent sellValuableEvent = new SellValuableEvent("Pearl Necklace", 500, 0.9);

        person.setBankBalance(1000);

        when(mockedScanner.nextLine()).thenReturn("y");

        when(mockedRNG.nextDouble()).thenReturn(0.2);

        sellValuableEvent.executeOn(person, mockedScanner, mockedRNG);

        assertEquals(500, person.getBankBalance());
    }

    @Test
    void testSellValuableEventIsNotChosen() {

        final SellValuableEvent sellValuableEvent = new SellValuableEvent("Gold Money Clip", 300, 0.8);

        person.setBankBalance(1000);

        when(mockedScanner.nextLine()).thenReturn("n");

        when(mockedRNG.nextDouble()).thenReturn(0.1);

        sellValuableEvent.executeOn(person, mockedScanner, mockedRNG);

        assertEquals(1000, person.getBankBalance());
    }



}
