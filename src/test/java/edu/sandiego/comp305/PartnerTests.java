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
        partner = new Partner("Name", Age.ADULT, 80, dna, 0.0);
    }

    @Test
    public void testLifeStageIsPartner(){
        assertEquals("Life with a Partner", partner.getLifeStage());
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

    @Test
    public void testChooseLocationSetsLocation(){
        final Location location = Location.SAN_DIEGO;
        partner.chooseLocation(location);
        assertEquals("CA", partner.getLocation().getState());
    }

    @Test
    public void testChooseCalculateBankWithSalary(){
        partner.chooseCareer(Career.LAWYER);
        partner.calculateBankBalance();
        assertEquals(Career.LAWYER.salary, partner.getBankBalance());
    }
}
