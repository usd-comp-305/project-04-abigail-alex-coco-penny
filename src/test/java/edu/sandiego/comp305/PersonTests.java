package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PersonTests {

    private static class TestPerson extends Person{

        public TestPerson(final String name, final Age age,
                          final DNA dna, final double bankBalance) {
            super(name, age, dna, bankBalance);
        }

        @Override
        public String getLifeStage() {
            return "initialPerson";
        }
    }
    private DNA dnaWithTraits;

    private TestPerson person;

    @BeforeEach
    public void setUp() {
        final Map<Allele, AllelePair> traits  = new HashMap<>();
        traits.put(Allele.EYE_COLOR, new AllelePair('B', 'b'));
        traits.put(Allele.HEIGHT, new AllelePair('B', 'b'));
        traits.put(Allele.HAIR_COLOR, new AllelePair('B', 'b'));
        dnaWithTraits = new DNA(traits);
        person = new TestPerson("Name", Age.CHILD, dnaWithTraits, 0);
    }

    @Test
    public void testGetName() {
        assertEquals("Name", person.getName());
    }

    @Test
    public void testGetAge() {
        assertEquals(Age.CHILD, person.getAge());
    }

    @Test
    public void testSetAge() {
        person.setAge(Age.YOUNG_ADULT);
        assertEquals(Age.YOUNG_ADULT, person.getAge());
    }

    @Test
    public void testSetDNA() {
        final Map<Allele, AllelePair> traits = new HashMap<>();
        traits.put(Allele.EYE_COLOR, new AllelePair('B', 'b'));
        traits.put(Allele.HEIGHT, new AllelePair('B', 'b'));
        traits.put(Allele.HAIR_COLOR, new AllelePair('B', 'b'));
        final DNA newDNA = new DNA(traits);
        assertEquals(newDNA, person.getDna());
    }

    @Test
    public void testGetPhenotypeEyeColor(){
        assertEquals("brown", person.getPhenotype().getEyeColor());
    }

    @Test
    public void testGetPhenotypeHairColor(){
        assertEquals("brown", person.getPhenotype().getHairColor());
    }

    @Test
    public void testGetPhenotypeHeight(){
        assertEquals("tall", person.getPhenotype().getHeight());
    }

    @Test
    public void testGetPhenotypeRecessiveEyeColor(){
        final Map<Allele, AllelePair> recessiveTraits = new HashMap<>();
        recessiveTraits.put(Allele.EYE_COLOR, new AllelePair('b', 'b'));
        recessiveTraits.put(Allele.HEIGHT, new AllelePair('b', 'b'));
        recessiveTraits.put(Allele.HAIR_COLOR, new AllelePair('b', 'b'));
        person.setDNA(new DNA(recessiveTraits));
        assertEquals("blue", person.getPhenotype().getEyeColor());
    }


}
