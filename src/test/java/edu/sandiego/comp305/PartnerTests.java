package edu.sandiego.comp305;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PartnerTests {

    private Partner partner;

    @BeforeEach
    public void setUp() {
        final DNA dna = new DNA(new HashMap<>());
        partner = new Partner("Name", Age.MIDDLE_AGE, 80, dna);
    }
    @Test
    public void testLifeStageIsPartner(){
        assertEquals("Partner", partner.getLifeStage());
    }
    @Test
    public void testGetBankBalanceInitial(){
        assertEquals(0.0, partner.getBankBalance());
    }

    @Test
    public void testSettBankBalance(){
        partner.setBankBalance(1000);
        assertEquals(1000, partner.getBankBalance());
    }

    @Test
    public void testGetInitialCompatibilityScore(){
        assertEquals(0.0, partner.getCompatibilityScore());
    }

    @Test
    public void testSetCompatibilityScore(){
        partner.setCompatibilityScore(0.75);
        assertEquals(0.75, partner.getCompatibilityScore());
    }

    @Test
    public void testChooseCareerSetsCareer(){
        partner.chooseCareer(Career.LAWYER);
        assertEquals(Career.LAWYER, partner.getCareer());
    }
}
