package edu.sandiego.comp305;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;


import static org.junit.jupiter.api.Assertions.*;


public class ChildTest {
    private Character parent1;

    private Partner parent2;

    private Child child;

    private DNA dnaWithTraits;

    @BeforeEach
    public void setUp() {
        final Map<Allele, AllelePair> traits = new HashMap<>();
        traits.put(Allele.EYE_COLOR, new AllelePair('B', 'b'));
        traits.put(Allele.HEIGHT, new AllelePair('B', 'b'));
        traits.put(Allele.HAIR_COLOR, new AllelePair('B', 'b'));
        dnaWithTraits = new DNA(traits);
        parent1 = new Character("Parent1", Age.ADULT, dnaWithTraits, 0);
        parent2 = new Partner("Parent2", Age.ADULT, dnaWithTraits, 0);
        child = new Child("Child", Age.CHILD, dnaWithTraits, parent1, parent2, 0);
    }

    @Test
    public void testLifeStageIsChild() {
        assertEquals("Family Development", child.getLifeStage());
    }

    @Test
    public void testInheritDNATraitsSetsNewDNA() {
        final Random mockRng = Mockito.mock(Random.class);
        Mockito.when(mockRng.nextBoolean()).thenReturn(true);
        child.inheritDNATraits(mockRng);
        assertNotNull(child.getDna().getAllelePair(Allele.EYE_COLOR));
    }

    @Test
    public void testSetWentCollegeTrue(){
        child.setWentToCollege(true);
        assertTrue(child.getWentToCollege());
    }

    @Test
    public void testGetPhenotypeEyeColor(){
        final Phenotype phenotype = child.getPhenotype();
        assertEquals("brown", phenotype.getHairColor());
    }

    @Test
    public void testGetPhenotypeHeight(){
        final Phenotype phenotype = child.getPhenotype();
        assertEquals("tall", phenotype.getHairColor());
    }

    @Test
    public void testGetPhenotypeHairColor(){
        final Phenotype phenotype = child.getPhenotype();
        assertEquals("brown", phenotype.getHairColor());
    }
}

