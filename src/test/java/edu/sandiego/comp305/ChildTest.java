package edu.sandiego.comp305;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class ChildTest {
    private Character parent1;

    private Partner parent2;

    private Child child;

    @BeforeEach
    public void setUp() {
        final DNA dna = new DNA(new HashMap<>());
        parent1 = new Character("Parent1", Age.ADULT, 80, dna);
        parent2 = new Partner("Parent2", Age.ADULT, 90, dna);
        child = new Child("Child", Age.CHILD, 85, dna, parent1, parent2);
    }

    @Test
    public void testLifeStageIsChild(){
        assertEquals("Child", child.getLifeStage());
    }

    @Test
    public void testGetParentData() {
        assertNotNull(child.getParents());
    }

    @Test
    public void testInheritParentDNA_SetHealthScore(){


    }

}
