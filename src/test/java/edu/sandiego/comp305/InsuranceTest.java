package edu.sandiego.comp305;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

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
        when(character.getInsurables()).thenReturn(List.of());

        final Insurance insurance = new Insurance();
        insurance.calculatePremium(character);

        assertEquals(0.0, insurance.getTotalPremium());
    }

    @Test
    public void calcPremiumCarOnly() {
        final Car car = mock(Car.class);

        when(car.getPremium(character)).thenReturn(200.0);

        when(character.getInsurables()).thenReturn(List.of(car));

        final Insurance insurance = new Insurance();
        insurance.calculatePremium(character);

        assertEquals(200.0, insurance.getTotalPremium());
    }

    @Test
    public void calcPremiumHouseOnly() {
        final House house = mock(House.class);

        when(house.getPremium(character)).thenReturn(20000.0);

        when(character.getInsurables()).thenReturn(List.of(house));

        final Insurance insurance = new Insurance();
        insurance.calculatePremium(character);

        assertEquals(20000.0, insurance.getTotalPremium());
    }

    @Test
    public void calcPremiumAllAssets() {
        final Car car = mock(Car.class);
        final House house = mock(House.class);

        when(car.getPremium(character)).thenReturn(200.0);
        when(house.getPremium(character)).thenReturn(400.0);

        when(character.getInsurables()).thenReturn(List.of(car, house));

        final Insurance insurance = new Insurance();
        insurance.calculatePremium(character);

        assertEquals(600.0, insurance.getTotalPremium());
    }

    @Test
    public void recalculationResetsPremium() {
        final Car car = mock(Car.class);

        when(car.getPremium(character)).thenReturn(100.0);

        when(character.getInsurables()).thenReturn(List.of(car));

        final Insurance insurance = new Insurance();
        insurance.calculatePremium(character);

        assertEquals(100.0, insurance.getTotalPremium());

        when(car.getPremium(character)).thenReturn(300.0);

        when(character.getInsurables()).thenReturn(List.of(car));

        insurance.calculatePremium(character);

        assertEquals(300.0, insurance.getTotalPremium());
    }



}
