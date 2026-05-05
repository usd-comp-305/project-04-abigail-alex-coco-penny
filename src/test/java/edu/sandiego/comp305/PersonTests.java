package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PersonTests {

    private static class TestPerson extends Person{

        public TestPerson(String name, Age age, int healthScore, DNA dna) {
            super(name, age, healthScore, dna);
        }

        @Override
        public String getLifeStage() {
            return "initialPerson";
        }
    }
    private DNA testDNA;

    private Person testPerson;

    @BeforeEach
    public void setUp() {
        testDNA = new DNA(new HashMap<>());
        testPerson = new TestPerson("Name", Age.CHILD, 100, testDNA);
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
    public void testGetHealthScore() {
        assertEquals(100, testPerson.getHealthScore());
    }

    @Test
    public void testSetAge() {
        testPerson.setAge(Age.YOUNG_ADULT);
        assertEquals(Age.YOUNG_ADULT, testPerson.getAge());
    }

    @Test
    public void testSetHealthScore() {
        testPerson.setHealthScore(80);
        assertEquals(80, testPerson.getHealthScore());
    }

    @Test
    public void testGetDNA(){
        assertEquals(testDNA, testPerson.getDna());
    }

    private static class TestPerson extends Person{

        public TestPerson(final String name, final Age age,
                          final int healthScore,
                          final String phenotype) {
            super(name, age, healthScore, phenotype);
        }

        @Override
        public String getLifeStage() {
            return "initialPerson";
        }
    }
}
