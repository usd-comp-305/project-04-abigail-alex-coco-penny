package edu.sandiego.comp305;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class InsuranceTest {

    private Character character;

    @BeforeEach
    public void setUp() {
        character = mock(Character.class);
    }

    @Test
    public void calcPremiumNoInsuranceAssets() {
        when(character.getCar()).thenReturn(null);
        when(character.getHouse()).thenReturn(null);

        Insurance insurance = new Insurance();
        insurance.calculatePremium(character);

        assertEquals(0.0, insurance.getTotalPremium());
    }

    @Test
    public void calcPremiumCarOnly() {
        Car car = mock(Car.class);

        when(character.getCar()).thenReturn(car);
        when(character.getHouse()).thenReturn(null);

        when(car.getPremium(character)).thenReturn(200.0);

        Insurance insurance = new Insurance();
        insurance.calculatePremium(character);

        assertEquals(200.0, insurance.getTotalPremium());
    }

    @Test
    public void calcPremiumHouseOnly() {
        House house = mock(House.class);

        when(character.getCar()).thenReturn(null);
        when(character.getHouse()).thenReturn(house);

        when(house.getPremium(character)).thenReturn(20000.0);

        Insurance insurance = new Insurance();
        insurance.calculatePremium(character);

        assertEquals(20000.0, insurance.getTotalPremium());
    }

}
