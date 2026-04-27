package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTests {
    @Test
    public void testGetName() {
        Person person = new Person();
        assertEquals("Name", person.getName());
    }
    @Test
    public void testGetAge() {
        Person person = new Person();
        assertEquals(18, person.getAge());
    }
}
