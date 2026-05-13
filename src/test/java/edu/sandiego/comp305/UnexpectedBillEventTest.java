package edu.sandiego.comp305;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class UnexpectedBillEventTest {

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

        final FinancialLifeEvent unexpectedBillEvent = new UnexpectedBillEvent("Utility Bill", 100);

        person.setBankBalance(150);

        unexpectedBillEvent.executeOn(person, mockedScanner, mockedRNG);

        assertEquals(50, person.getBankBalance());
    }

    @Test
    void testUnexpectedBillEventPutsPlayerBankrupt() {

        final FinancialLifeEvent unexpectedBillEvent = new UnexpectedBillEvent("Hospital Bill", 1000);

        person.setBankBalance(150);

        unexpectedBillEvent.executeOn(person, mockedScanner, mockedRNG);

        assertEquals(-850, person.getBankBalance());
    }



}
