package edu.sandiego.comp305;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class RiskyStartupEventTest {

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
    void testUnexpectedBillEventAltersBankBalance() {

        final RiskyLifeEvent riskyStartUpEvent = new RiskyStartUpEvent("Tech Startup", 10000, 0.8);

        person.setBankBalance(15000);

        when(mockedScanner.nextLine()).thenReturn("y");

        when(mockedRNG.nextDouble()).thenReturn(0.1);

        riskyStartUpEvent.executeOn(person, mockedScanner, mockedRNG);

        assertEquals(39000, person.getBankBalance());
    }

}
