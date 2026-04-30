package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CharacterTest {
    @Test
    public void testGetBankBalance(){
        Character character = new Character();
        assertEquals(1000, character.getBankBalance());
    }
    public void testGetDNA(){
        Character character = new Character();
        DNA dna = new DNA():
        assertNotNull(character.getDNA(dna));
    }
}
