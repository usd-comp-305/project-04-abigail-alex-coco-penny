package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class CarTest {
    @Test
    public void carAppliesInsurance() {}

    @Test
    public void carUsesBaseRateCalculatePremium() {
        Person person = mock(Person.class);
        when(person.getAge()).thenReturn(Age.ADULT);

        double premium = Car.SEDAN.getPremium(person);

        assertTrue(premium >= Car.SEDAN.baseRate);
    }

    @Test
    public void carUsesYearCalculatePremium() {
        Person person = mock(Person.class);
        when(person.getAge()).thenReturn(Age.ADULT);

        double oldCarPremium = Car.HATCHBACK.getPremium(person); // 2008
        double newCarPremium = Car.VAN.getPremium(person);       // 2025

        assertTrue(newCarPremium > oldCarPremium);
    }

    @Test
    public void carUsesValueCalculatePremium() {
        Person person = mock(Person.class);
        when(person.getAge()).thenReturn(Age.ADULT);

        double lowValue = Car.HATCHBACK.getPremium(person);
        double highValue = Car.WAGON.getPremium(person);

        assertTrue(highValue > lowValue);
    }

    @Test
    public void carUsesAgeCalculatePremium() {
        Person teen = mock(Person.class);
        when(teen.getAge()).thenReturn(Age.YOUNG_ADULT);

        Person adult = mock(Person.class);
        when(adult.getAge()).thenReturn(Age.ADULT);

        double immature = Car.MICRO.getPremium(teen);
        double mature = Car.MICRO.getPremium(adult);

        assertTrue(immature > mature);
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
