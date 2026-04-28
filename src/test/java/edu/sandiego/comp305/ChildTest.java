package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ChildTest {
    @Test
    public void testChild() {
        Child child = new Child();
        assertNotNull(child,getParents());
    }
}
