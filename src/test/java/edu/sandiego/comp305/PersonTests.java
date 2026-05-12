package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PersonTests {

    private DNA testDNA;

    private Person testPerson;

    @BeforeEach
    public void setUp() {
        testDNA = new DNA(new HashMap<>());
        testPerson = new TestPerson("Name", Age.CHILD, testDNA, 0);
    }

    @Test
    public void testGetName() {
        assertEquals("Name", testPerson.getName());
    }

    @Test
    public void testGetAge() {
        assertEquals(Age.CHILD, testPerson.getAge());
    }

    @Test
    public void testSetAge() {
        testPerson.setAge(Age.YOUNG_ADULT);
        assertEquals(Age.YOUNG_ADULT, testPerson.getAge());
    }

    @Test
    public void testSetDNA() {
        final Map<Allele, AllelePair> traits = new HashMap<>();
        final DNA newDNA = new DNA(traits);
        testPerson.setDNA(newDNA);
        assertEquals(newDNA, testPerson.getDna());
    }

    @Test
    public void testGetDNA(){
        assertEquals(testDNA, testPerson.getDna());
    }

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
}
