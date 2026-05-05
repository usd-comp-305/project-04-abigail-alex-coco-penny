package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTests {

    @Test
    public void testGetName() {
        final Person person = new TestPerson("Name", Age.CHILD, 0, "ABCD");
        assertEquals("Name", person.getName());
    }

    @Test
    public void testGetAge() {
        final Person person  = new TestPerson("Name", Age.CHILD, 0, "ABCD");
        assertEquals(Age.CHILD, person.getAge());
    }

    @Test
    public void testGetHealthScore() {
        final Person person = new TestPerson("Name", Age.CHILD, 100, "ABCD");
        assertEquals(100, person.getHealthScore());
    }

    @Test
    public void testSetAge() {
        final Person person = new TestPerson("Name", Age.CHILD, 0, "ABCD");
        person.setAge(Age.YOUNG_ADULT);
        assertEquals(Age.YOUNG_ADULT, person.getAge());
    }

    @Test
    public void testSetHealthScore() {
        final Person person = new TestPerson("Name", Age.CHILD, 0, "ABCD");
        person.setHealthScore(100);
        assertEquals(100, person.getHealthScore());
    }

    @Test
    public void testGetPhenotype() {
        final Person person = new TestPerson("Name", Age.CHILD, 0, "ABCD");
        assertEquals("ABCD", person.getPhenotype());
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
