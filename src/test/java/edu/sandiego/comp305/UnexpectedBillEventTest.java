package edu.sandiego.comp305;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class UnexpectedBillEventTest {

    private Person person;

    private DNA mockedDNA = mock(DNA.class);

    private Scanner mockedScanner;

    @BeforeEach
    void setUp() {
        person = new Character("Person_1", Age.ADULT, 100, mockedDNA, 0);
        mockedScanner = mock(Scanner.class);
    }

    @Test
    void testUnexpectedBillEventAltersBankBalance() {

        FinancialLifeEvent unexpectedBillEvent = new UnexpectedBillEvent("Utility Bill", 100);

        person.setBankBalance(150);

        unexpectedBillEvent.executeOn(person, mockedScanner);

        assertEquals(50, person.getBankBalance());
    }

    @Test
    void testUnexpectedBillEventPutsPlayerBankrupt() {

        FinancialLifeEvent unexpectedBillEvent = new UnexpectedBillEvent("Hospital Bill", 1000);

        person.setBankBalance(150);

        unexpectedBillEvent.executeOn(person, mockedScanner);

        assertEquals(-850, person.getBankBalance());
    }



}
