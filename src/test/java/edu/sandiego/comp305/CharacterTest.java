package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CharacterTest {

    private Character character;

    @BeforeEach
    public void setUp() {
        final Map<Allele, AllelePair> traits = new HashMap<>();
        traits.put(Allele.EYE_COLOR, new AllelePair('B', 'b'));
        traits.put(Allele.HEIGHT, new AllelePair('A', 'a'));
        traits.put(Allele.HAIR_COLOR, new AllelePair('B', 'b'));
        final DNA dna = new DNA(traits);
        character = new Character ("Name", Age.YOUNG_ADULT, 100, dna, 0);
    }

    @Test
    public void testGetLifeStage(){
        assertEquals("Character", character.getLifeStage());
    }

    @Test
    public void testGetBankBalance(){
        assertEquals(0.0, character.getBankBalance());
    }

    @Test
    public void testChooseLocationSetsLocation(){
        final Location location = Location.SAN_DIEGO;
        character.chooseLocation(location);
        assertEquals("San Diego", character.getLocation().getCity());
    }

    @Test
    public void testChooseCareerSetsCareer(){
        character.chooseCareer(Career.ENGINEER);
        assertEquals(Career.ENGINEER, character.getCareer());
    }

    @Test
    public void testBuyCarSetsCar(){
        final Car car = Car.SEDAN;
        character.buyCar(car);
        assertEquals(car, character.getCar());

    }

    @Test
    public void testBuyHouseAddsInsurable() {
        final House house = House.HUT;
        character.buyHouse(house);
        assertTrue(character.getInsurables().contains(house));
    }

    @Test
    public void testChooseCalculateBankWithSalary(){
        character.chooseCareer(Career.ENGINEER);
        character.calculateBankBalance();
        assertEquals(Career.ENGINEER.salary, character.getBankBalance());
    }

    @Test
    public void testGetPhenotypeEyeColor(){
        assertEquals("brown", character.getPhenotype().getEyeColor());
    }

    @Test
    public void testGetPhenotypeHeight(){
        assertEquals("tall", character.getPhenotype().getHeight());
    }

    @Test
    public void testGetPhenotypeHairColor(){
        assertEquals("brown", character.getPhenotype().getHairColor());
    }

}
