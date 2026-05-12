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
    public void houseUsesValueCalculatePremium() {
        final double lowValue = House.HUT.calculatePremium(person);
        final double highValue = House.CASTLE.calculatePremium(person);

        assertTrue(highValue > lowValue);
    }

    @Test
    public void houseUsesAgeCalculatePremium() {
        final Person youngerPerson = mock(Person.class);
        when(youngerPerson.getAge()).thenReturn(Age.YOUNG_ADULT);
        when(youngerPerson.getLocation()).thenReturn(Location.SAN_DIEGO);

        final double youngerHomeOwner = House.APARTMENT.calculatePremium(youngerPerson);
        final double olderHomeOwner = House.APARTMENT.calculatePremium(person);

        assertTrue(youngerHomeOwner > olderHomeOwner);
    }

    @Test
    public void houseUsesLocationCalculatePremium() {
        final DNA mockDNA = mock(DNA.class);

        final Character characterInSafeLocation = new Character("Safe", Age.ADULT, 80, mockDNA, 0);

        characterInSafeLocation.chooseLocation(Location.SEATTLE);

        final Character characterInRiskyLocation = new Character("Risky", Age.ADULT, 80, mockDNA, 0);

        characterInRiskyLocation.chooseLocation(Location.MIAMI);

        final double lowRiskHouse = House.APARTMENT.calculatePremium(characterInSafeLocation);

        final double highRiskHouse = House.APARTMENT.calculatePremium(characterInRiskyLocation);

        assertTrue(highRiskHouse > lowRiskHouse);
    }


}
