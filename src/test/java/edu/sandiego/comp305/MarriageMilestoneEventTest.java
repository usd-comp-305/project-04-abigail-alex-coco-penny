package edu.sandiego.comp305;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MarriageMilestoneEventTest {

    private Character person;
    private DNA mockedDNA;
    private Scanner mockedScanner;
    private Random mockedRNG;

    @BeforeEach
    void SetUp() {
        mockedDNA = mock(DNA.class);
        mockedScanner = mock(Scanner.class);
        mockedRNG = mock(Random.class);
        person = new Character("TestPerson", Age.ADULT, mockedDNA, 1000);
    }

    @Test
    void testMarriageYesPartnerWorks() {
        when(mockedScanner.nextLine()).thenReturn("y").thenReturn("Partner");
        final MarriageMilestoneEvent marriageMilestoneEvent = new MarriageMilestoneEvent();
        marriageMilestoneEvent.executeOn(person, mockedScanner, mockedRNG);
        assertNotNull(person.getPartner());
    }
}
