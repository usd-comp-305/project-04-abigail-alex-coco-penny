package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PartnerTests {
    @Test
    public void testLifeStageIsPartner(){
        Partner partner = new Partner();
        assertEquals("Partner", partner.getLifeStage());
    }
    @Test
    public void testGetBankBalance(){
        Partner partner = new Partner();
        assertEquals(1000, partner.getBankBalance());
    }

    @Test
    public void testSettBankBalance(){
        Partner partner = new Partner();
        partner.setBankBalance(1000);
        assertEquals(1000, partner.getBankBalance());
    }

    @Test
    public void testGetInitialCompatibilityScore(){
        Partner partner = new Partner();
        assertEquals(0.0, partner.getCompatibilityScore());
    }

    @Test
    public void testSetCompatibilityScore(){
        Partner partner = new Partner();
        partner.setCompatibilityScore(0.75);
        assertEquals(0.75, partner.getCompatibilityScore());
    }
}
