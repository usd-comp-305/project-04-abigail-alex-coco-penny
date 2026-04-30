package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CharacterTest {
    @Test
    public void testGetLifeStage(){
        Character character = new Character("Name", Age.YOUNG_ADULT, 0, "ABCD");
        assertEquals("Character", character.getLifeStage());
    }
    @Test
    public void testGetBankBalance(){
        Character character = new Character("Name", Age.YOUNG_ADULT, 0, "ABCD");
        assertEquals(1000, character.getBankBalance());
    }

    @Test
    public void testGetDNA(){
        Character character = new Character("Name", Age.YOUNG_ADULT, 0, "ABCD");
        DNA dna = new DNA():
        assertNotNull(character.getDNA());
    }

    @Test
    public void testChooseLocation(){
        Character character = new Character("Name", Age.YOUNG_ADULT, 0, "ABCD");
        Location location = new Location("San Diego", "CA");
        character.chooseLocation(location);
        assertEquals("San Diego", location.getCity());
    }





}
