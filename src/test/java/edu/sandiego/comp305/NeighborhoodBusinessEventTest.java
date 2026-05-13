package edu.sandiego.comp305;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class NeighborhoodBusinessEventTest {
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
    void testNeighborhoodBusinessGoesWell() {

        final NeighborhoodBusinessEvent neighborhoodBusinessEvent = new NeighborhoodBusinessEvent("Lemonade Stand", 100, 0.2);

        person.setBankBalance(500);

        when(mockedScanner.nextLine()).thenReturn("y");

        when(mockedRNG.nextDouble()).thenReturn(0.1);

        neighborhoodBusinessEvent.executeOn(person, mockedScanner, mockedRNG);

        assertEquals(540, person.getBankBalance());
    }

    @Test
    void testNeighborhoodBusinessDoesBad() {

        final NeighborhoodBusinessEvent neighborhoodBusinessEvent = new NeighborhoodBusinessEvent("Window Cleaning", 200, 0.7);

        person.setBankBalance(500);

        when(mockedScanner.nextLine()).thenReturn("y");

        when(mockedRNG.nextDouble()).thenReturn(0.4);

        neighborhoodBusinessEvent.executeOn(person, mockedScanner, mockedRNG);

        assertEquals(300, person.getBankBalance());
    }

    @Test
    void testNeighborhoodBusinessIsNotChosen() {

        final NeighborhoodBusinessEvent neighborhoodBusinessEvent = new NeighborhoodBusinessEvent("Window Cleaning", 200, 0.7);

        person.setBankBalance(500);

        when(mockedScanner.nextLine()).thenReturn("n");

        when(mockedRNG.nextDouble()).thenReturn(0.4);

        neighborhoodBusinessEvent.executeOn(person, mockedScanner, mockedRNG);

        assertEquals(500, person.getBankBalance());
    }






}
