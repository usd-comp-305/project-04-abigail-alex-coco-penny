package edu.sandiego.comp305;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class InvestmentOpportunityEventTest {


    private Person person;

    private DNA mockedDNA = mock(DNA.class);

    private Scanner mockedScanner;

    @BeforeEach
    void setUp() {
        person = new Character("person_1", Age.ADULT, 100, mockedDNA, 0.0);

        mockedScanner = mock(Scanner.class);
    }

    @Test
    void testInvestmentOpportunityEventAltersBankBalance() {

        InvestmentOpportunityEvent investmentOpportunityEvent = new InvestmentOpportunityEvent("Government Bonds", 10000);

        person.setBankBalance(100000);

        when(mockedScanner.nextLine()).thenReturn("y");

        investmentOpportunityEvent.executeOn(person, mockedScanner);

        double currBalance = person.getBankBalance();


        assertEquals(90000, currBalance);

    }

    @Test
    void testRejectedInvestmentOpportunityEventDoesNotAlterBankBalance() {

        InvestmentOpportunityEvent investmentOpportunityEvent = new InvestmentOpportunityEvent("Real Estate", 100000);

        person.setBankBalance(200000);

        when(mockedScanner.nextLine()).thenReturn("n");

        investmentOpportunityEvent.executeOn(person, mockedScanner);

        double currBalance = person.getBankBalance();


        assertEquals(200000, currBalance);

    }

}
