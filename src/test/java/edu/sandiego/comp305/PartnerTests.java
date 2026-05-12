package edu.sandiego.comp305;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PartnerTests {

    private Partner partner;

    @BeforeEach
    public void setUp() {
        final Map<Allele, AllelePair> traits  = new HashMap<>();
        traits.put(Allele.EYE_COLOR, new AllelePair('B', 'b'));
        traits.put(Allele.HEIGHT, new AllelePair('B', 'b'));
        traits.put(Allele.HAIR_COLOR, new AllelePair('B', 'b'));
        final DNA dna = new DNA(traits);
        partner = new Partner("Name", Age.CHILD, dna, 0);
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
    public void testGenerateDNAContainsAlleles(){
        final Random mockRng = Mockito.mock(Random.class);
        Mockito.when(mockRng.nextBoolean()).thenReturn(true);
        Mockito.when(mockRng.nextInt(2)).thenReturn(0);
        partner.generateDNA(mockRng);
        for(final Allele allele : Allele.values()){
            assertNotNull(partner.getDna().getAllelePair(allele));
        }
    }

    @Test
    public void testCalculateBankBalanceWithCareer(){
        partner.chooseCareer(Career.ENGINEER);
        partner.calculateBankBalance();
        assertEquals((double)Career.ENGINEER.salary, partner.getBankBalance());
    }
}
