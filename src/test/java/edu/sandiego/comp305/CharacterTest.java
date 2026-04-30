package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CharacterTest {
    @Test
    public void testGetLifeStage(){
        Character character = new Character();
        assertEquals("Character", character.getLifeStage())
    }
    @Test
    public void testGetBankBalance(){
        Character character = new Character();
        assertEquals(1000, character.getBankBalance());
    }

    @Test
    public void testGetDNA(){
        Character character = new Character();
        DNA dna = new DNA():
        assertNotNull(character.getDNA());
    }




}
