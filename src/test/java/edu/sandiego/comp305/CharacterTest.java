package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharacterTest {
    @Test
    public void testGetBankBalance(){
        Character character = new Character();
        assertEquals(1000, character.getBankBalance());
    }
}
