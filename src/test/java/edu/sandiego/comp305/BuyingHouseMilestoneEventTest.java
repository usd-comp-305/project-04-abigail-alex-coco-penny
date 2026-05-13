package edu.sandiego.comp305;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.*;

public class BuyingHouseMilestoneEventTest {

    private Character person;
    private DNA mockedDNA;
    private Scanner mockedScanner;
    private Random mockedRNG;

    @BeforeEach
    void SetUp() {
        mockedDNA = mock(DNA.class);
        mockedScanner = mock(Scanner.class);
        mockedRNG = mock(Random.class);
        person = new Character("TestPerson", Age.ADULT, mockedDNA, 1000000);
    }

    @Test
    public void BuysHouseHouseSet() {
        when(mockedScanner.nextLine()).thenReturn("y");

        final BuyingHouseMilestoneEvent event = new BuyingHouseMilestoneEvent();
        event.executeOn(person, mockedScanner, mockedRNG);

        assertNotNull(person.getHouse());

    }

    @Test
    public void DoesNotBuyHouseHouseNull() {
        when(mockedScanner.nextLine()).thenReturn("n");

        final BuyingHouseMilestoneEvent event = new BuyingHouseMilestoneEvent();
        event.executeOn(person, mockedScanner, mockedRNG);

        assertNull(person.getHouse());

    }

    @Test
    public void BuysHouseAccountDecreases() {
        when(mockedScanner.nextLine()).thenReturn("y");
        final double balanceBefore = person.getBankBalance();

        final BuyingHouseMilestoneEvent event = new BuyingHouseMilestoneEvent();
        event.executeOn(person, mockedScanner, mockedRNG);

        assertTrue(person.getBankBalance() < balanceBefore);

    }

    @Test
    public void DoesntBuyHouseAccountDoesntDecreases() {
        when(mockedScanner.nextLine()).thenReturn("y=n");
        final double balanceBefore = person.getBankBalance();

        final BuyingHouseMilestoneEvent event = new BuyingHouseMilestoneEvent();
        event.executeOn(person, mockedScanner, mockedRNG);

        assertTrue(person.getBankBalance() == balanceBefore);

    }

}
