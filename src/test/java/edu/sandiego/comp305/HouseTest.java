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
        when(person.getLocation()).thenReturn(Location.SAN_DIEGO);
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
        when(youngerPerson.getLocation()).thenReturn(Location.SAN_DIEGO);

        final double youngerHomeOwner = House.APARTMENT.getPremium(youngerPerson);
        final double olderHomeOwner = House.APARTMENT.getPremium(person);

        assertTrue(youngerHomeOwner > olderHomeOwner);
    }

    @Test
    public void houseUsesLocationCalculatePremium() {
        final DNA mockDNA = mock(DNA.class);

        final Character characterInSafeLocation = new Character("Safe", Age.ADULT, 80, mockDNA);

        characterInSafeLocation.chooseLocation(Location.SEATTLE);

        final Character characterInRiskyLocation = new Character("Risky", Age.ADULT, 80, mockDNA);

        characterInRiskyLocation.chooseLocation(Location.MIAMI);

        final double lowRiskHouse = House.APARTMENT.getPremium(characterInSafeLocation);

        final double highRiskHouse = House.APARTMENT.getPremium(characterInRiskyLocation);

        assertTrue(highRiskHouse > lowRiskHouse);
    }


}
