package edu.sandiego.comp305;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class HouseTest {

    private Person person;

    @BeforeEach
    public void setUp() {
        person = mock(Person.class);
        when(person.getAge()).thenReturn(Age.ADULT);
    }

    @Test
    public void houseAppliesInsurance() {}

    @Test
    public void houseGetsPremium() {}

    @Test
    public void houseUsesValueCalculatePremium() {
        final double lowValue = House.HUT.getPremium(person);
        final double highValue = House.CASTLE.getPremium(person);

        assertTrue(highValue > lowValue);
    }

    @Test
    public void houseUsesAgeCalculatePremium() {
        final Person youngerPerson = mock(Person.class);
        when(youngerPerson.getAge()).thenReturn(Age.YOUNG_ADULT);

        final double youngerCarOwner = House.APARTMENT.getPremium(youngerPerson);
        final double olderCarOwner = House.APARTMENT.getPremium(person);

        assertTrue(youngerCarOwner > olderCarOwner);
    }


}
