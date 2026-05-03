package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AllelePairTests {

    @Test
    public void isDominantExpressedMaternalCopy () {
        AllelePair testPair = new AllelePair('B', 'b');
        assertTrue(testPair.isDominantExpressed());
    }
}
