package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTests {
    private static class TestPerson extends Person{
        public TestPerson(String name, int age, int healthScore, String phenotype) {
            super(name, age, healthScore, phenotype);
        }

        @Override
        public String getName() { return name;
        }
        @Override
        public int getAge() {
            return age;
        }
        @Override
        public int getHealthScore() {
            return healthScore;
        }
        @Override
        public void setHealthScore(int healthScore) {
        }
        @Override
        public void setAge(int age){
        }
    }

    @Test
    public void testGetName() {
        Person person = new TestPerson("Name", 0, 0, "ABCD");
        assertEquals("Name", person.getName());
    }

    @Test
    public void testGetAge() {
        Person person = new TestPerson("Name", 18, 0, "ABCD");
        assertEquals(18, person.getAge());
    }

    @Test
    public void testGetHealthScore() {
        Person person = new TestPerson("Name", 0, 100, "ABCD");
        assertEquals(100, person.getHealthScore());
    }

    @Test
    public void testSetAge() {
        Person person = new TestPerson("Name", 0, 0, "ABCD");
        person.setAge(18);
        assertEquals(18, person.getAge());
    }

    @Test
    public void testSetHealthScore() {
        Person person = new TestPerson("Name", 0, 0, "ABCD");
        person.setHealthScore(100);
        assertEquals(100, person.getHealthScore());
    }
}
