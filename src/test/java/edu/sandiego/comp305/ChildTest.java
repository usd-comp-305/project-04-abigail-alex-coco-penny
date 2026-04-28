package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ChildTest {
    @Test
    public void testGetParentData() {
        Child child = new Child();
        assertNotNull(child.getParents());
    }
    @Test
    public void testInheritParentData(){
        Child child = new Child();
        Person parent1 = new TestPerson();
        Person parent2 = new TestPerson();
        child.inheritTraits(parent1, parent2);
        assertNotNull(child.getPhenotype());
    }
}
