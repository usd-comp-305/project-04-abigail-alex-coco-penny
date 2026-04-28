package edu.sandiego.comp305;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class MilestoneEventTests {

    @Test
    void testExecuteAltersCharactersChildrenListDuringHadAChildEvent() {

        ArrayList<Age> validAges = new ArrayList<>();
        validAges.add(Age.MIDDLE_AGE);
        validAges.add(Age.SENIOR);

        MilestoneEvent milestoneEvent = new MilestoneEvent(MilestoneType.HAVING_A_CHILD, 0, validAges);



    }
}
