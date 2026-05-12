package edu.sandiego.comp305;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;


import static org.junit.jupiter.api.Assertions.*;


public class ChildTest {
    private Character parent1;

    private Partner parent2;

    private Child child;

    @BeforeEach
    public void setUp() {
        final DNA dna = new DNA(new HashMap<>());
        parent1 = new Character("Parent1", Age.ADULT,dna);
        parent2 = new Partner("Parent2", Age.ADULT,  dna);
        child = new Child("Child", Age.CHILD, 85, dna, parent1, parent2);
    }

    @Test
    public void testLifeStageIsChild(){
        assertEquals("Child", child.getLifeStage());
    }


    }

}
