package edu.sandiego.comp305;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SportsPlayingRiskyEventTest {

    private Person person;

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
    void testSportsPlayingRiskyEventGoesWell() {

        final SportsPlayingRiskyEvent sportsPlayingRiskyEvent = new SportsPlayingRiskyEvent("Soccer", 30, 0.5);

        person.setBankBalance(200);

        when(mockedScanner.nextLine()).thenReturn("y");

        when(mockedRNG.nextDouble()).thenReturn(0.1);

        sportsPlayingRiskyEvent.executeOn(person, mockedScanner, mockedRNG);

        assertEquals(245, person.getBankBalance());
    }

    @Test
    void testSportsPlayingRiskyEventGoesBad() {

        final SportsPlayingRiskyEvent sportsPlayingRiskyEvent = new SportsPlayingRiskyEvent("Basketball", 20, 0.3);

        person.setBankBalance(100);

        when(mockedScanner.nextLine()).thenReturn("y");

        when(mockedRNG.nextDouble()).thenReturn(0.1);

        sportsPlayingRiskyEvent.executeOn(person, mockedScanner, mockedRNG);

        assertEquals(118, person.getBankBalance());
    }

    @Test
    void testSportsPlayingRiskyEventIsNotChosen() {

        final SportsPlayingRiskyEvent sportsPlayingRiskyEvent = new SportsPlayingRiskyEvent("Basketball", 20, 0.3);

        person.setBankBalance(100);

        when(mockedScanner.nextLine()).thenReturn("n");

        when(mockedRNG.nextDouble()).thenReturn(0.1);

        sportsPlayingRiskyEvent.executeOn(person, mockedScanner, mockedRNG);

        assertEquals(100, person.getBankBalance());
    }

}
