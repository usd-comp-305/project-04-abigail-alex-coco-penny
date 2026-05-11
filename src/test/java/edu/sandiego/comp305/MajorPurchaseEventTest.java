package edu.sandiego.comp305;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MajorPurchaseEventTest {

    private Person person;

    private DNA mockedDNA = mock(DNA.class);

    private Scanner mockedScanner;

    private Random mockedRNG;

    @BeforeEach
    void setUp() {
        person = new Character("person_1", Age.ADULT, 100, mockedDNA, 0.0);

        mockedScanner = mock(Scanner.class);

        mockedRNG = mock(Random.class);
    }

    @Test
    void testMajorPurchaseEventAltersBankBalance() {

        MajorPurchaseEvent majorPurchaseEvent = new MajorPurchaseEvent("House", 10000);

        person.setBankBalance(100000);

        when(mockedScanner.nextLine()).thenReturn("y");


        majorPurchaseEvent.executeOn(person, mockedScanner, mockedRNG);

        double currBalance = person.getBankBalance();


        assertEquals(90000, currBalance);

    }

}
