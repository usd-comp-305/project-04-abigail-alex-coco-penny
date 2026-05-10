package edu.sandiego.comp305;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class CarTest {

    private Person person;

    @BeforeEach
    public void setUp() {
        person = mock(Person.class);
        when(person.getAge()).thenReturn(Age.ADULT);
    }


    @Test
    public void carAppliesInsurance() {}

    @Test
    public void carUsesBaseRateCalculatePremium() {
        final double premium = Car.SEDAN.getPremium(person);

        assertTrue(premium >= Car.SEDAN.baseRate);
    }

    @Test
    public void carUsesYearCalculatePremium() {
        final double oldCarPremium = Car.HATCHBACK.getPremium(person); // 2008
        final double newCarPremium = Car.VAN.getPremium(person);       // 2025

        assertTrue(newCarPremium > oldCarPremium);
    }

    @Test
    public void carUsesValueCalculatePremium() {
        final double lowValue = Car.HATCHBACK.getPremium(person);
        final double highValue = Car.WAGON.getPremium(person);

        assertTrue(highValue > lowValue);
    }

    @Test
    public void carUsesAgeCalculatePremium() {
        final Person youngerPerson = mock(Person.class);
        when(youngerPerson.getAge()).thenReturn(Age.YOUNG_ADULT);

        final double youngerCarOwner = Car.MICRO.getPremium(youngerPerson);
        final double olderCarOwner = Car.MICRO.getPremium(person);

        assertTrue(youngerCarOwner > olderCarOwner);
    }

    @Test
    public void carCalculatesPremiumYoungAdult() {

    }

    @Test
    public void carCalculatesPremiumAdult() {

    }

    @Test
    public void carCalculatesPremiumSenior() {

    }
}
