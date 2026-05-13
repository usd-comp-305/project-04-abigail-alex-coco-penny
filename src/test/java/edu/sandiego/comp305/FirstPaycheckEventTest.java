package edu.sandiego.comp305;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class FirstPaycheckEventTest {

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
    void testFirstPaycheckAltersBankBalance() {

        final FirstPaycheckEvent firstPaycheckEvent = new FirstPaycheckEvent(500);

        person.setBankBalance(500);

        firstPaycheckEvent.executeOn(person, mockedScanner, mockedRNG);

        assertEquals(1000, person.getBankBalance());
    }



}
