package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CharacterTest {

    private Character character;

    @BeforeEach
    public void setUp() {
        final DNA dna = new DNA(new HashMap<>());
        character = new Character ("Name", Age.YOUNG_ADULT, 100, dna);
    }
    @Test
    public void testGetLifeStage(){
        assertEquals("Character", character.getLifeStage());
    }
    @Test
    public void testGetBankBalance(){
        assertEquals(1000, character.getBankBalance());
    }

    @Test
    public void testGetDNA(){
        assertNotNull(character.getDNA());
    }

    @Test
    public void testChooseLocation(){
        Location location = new Location("San Diego", "CA");
        character.chooseLocation(location);
        assertEquals("San Diego", location.getCity());
    }





}
