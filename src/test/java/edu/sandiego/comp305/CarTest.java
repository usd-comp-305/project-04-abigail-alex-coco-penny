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
    }

    @Test
    public void carUsesCostCalculatePremium() {
    }

    @Test
    public void carUsesAgeCalculatePremium() {
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
