package edu.sandiego.comp305;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class InvestmentOpportunityEventTest {


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
    void testLowRiskInvestmentOpportunityEventAltersBankBalance() {

        InvestmentOpportunityEvent investmentOpportunityEvent = new InvestmentOpportunityEvent("Government Bonds", 10000, 0.5);

        person.setBankBalance(100000);

        when(mockedScanner.nextLine()).thenReturn("y");

        when(mockedRNG.nextDouble()).thenReturn(0.5);


        investmentOpportunityEvent.executeOn(person, mockedScanner, mockedRNG);

        double currBalance = person.getBankBalance();


        assertEquals(115000, currBalance);

    }

    @Test
    void testRejectedInvestmentOpportunityEventDoesNotAlterBankBalance() {

        InvestmentOpportunityEvent investmentOpportunityEvent = new InvestmentOpportunityEvent("Real Estate", 100000, 0.7);

        person.setBankBalance(200000);

        when(mockedScanner.nextLine()).thenReturn("n");

        investmentOpportunityEvent.executeOn(person, mockedScanner, mockedRNG);

        double currBalance = person.getBankBalance();


        assertEquals(200000, currBalance);

    }

    @Test
    void testHighRiskInvestmentOpportunityEventAltersBankBalance() {

        InvestmentOpportunityEvent investmentOpportunityEvent = new InvestmentOpportunityEvent("Cryptocurrency", 100000, 0.8);

        person.setBankBalance(1000000);

        when(mockedScanner.nextLine()).thenReturn("y");

        when(mockedRNG.nextDouble()).thenReturn(0.1);


        investmentOpportunityEvent.executeOn(person, mockedScanner, mockedRNG);

        double currBalance = person.getBankBalance();


        assertEquals(1240000, currBalance);

    }

}
