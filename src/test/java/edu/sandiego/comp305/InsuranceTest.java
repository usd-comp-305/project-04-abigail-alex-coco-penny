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
    public void insuranceHandlesHouseEvent() {}

    @Test
    public void insuranceCalculatesPremium() {}

}
