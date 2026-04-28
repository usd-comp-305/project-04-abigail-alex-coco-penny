package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PartnerTests {
    @Test
    public void testGetBankBalance(){
        Partner partner = new Partner();
        assertEquals(1000, partner.getBankBalance());

    }
}
