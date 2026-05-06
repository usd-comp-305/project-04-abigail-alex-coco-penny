package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AllelePairTests {

    @Test
    public void isDominantExpressedMaternalCopy () {
        final AllelePair testPair = new AllelePair('B', 'b');
        assertTrue(testPair.isDominantExpressed());
    }

    @Test
    public void isDominantExpressedPaternalCopy () {
        final AllelePair testPair = new AllelePair('b', 'B');
        assertTrue(testPair.isDominantExpressed());
    }

    @Test
    public void isDominantExpressedBothCopies () {
        final AllelePair testPair = new AllelePair('B', 'B');
        assertTrue(testPair.isDominantExpressed());
    }

    @Test
    public void isDominantExpressedReturnsFalse() {
        final AllelePair testPair = new AllelePair('b', 'b');
        assertFalse(testPair.isDominantExpressed());
    }
}
