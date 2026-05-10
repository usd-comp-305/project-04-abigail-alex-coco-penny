package edu.sandiego.comp305;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


public class DNATests {

    public AllelePair mockBB;
    public AllelePair mockBb;
    public AllelePair mockbB;
    public AllelePair mockbb;

    @BeforeEach
    public void setUpAllelePairs() {
        mockBB = mock(AllelePair.class);
        when(mockBB.getMaternalCopy()).thenReturn('B');
        when(mockBB.getPaternalCopy()).thenReturn('B');

        mockBb = mock(AllelePair.class);
        when(mockBb.getMaternalCopy()).thenReturn('B');
        when(mockBb.getPaternalCopy()).thenReturn('b');

        mockbB = mock(AllelePair.class);
        when(mockbB.getMaternalCopy()).thenReturn('b');
        when(mockbB.getPaternalCopy()).thenReturn('B');

        mockbb = mock(AllelePair.class);
        when(mockbb.getMaternalCopy()).thenReturn('b');
        when(mockbb.getPaternalCopy()).thenReturn('b');

    }

    // helper method for the tests
    public DNA createDNAMock(AllelePair mockPair) {
        Map<Allele, AllelePair> traits = new HashMap<>();
        for(Allele allele: Allele.values()) {
            traits.put(allele, mockPair);
        }
        return new DNA(traits);
    }


    @Test
    public void combineIsNotNull() {
        DNA parent1DNA = createDNAMock(mockBB);
        DNA parent2DNA = createDNAMock(mockBB);

        assertNotNull(DNA.combineSequences(parent1DNA, parent2DNA));
    }

    @Test
    public void combineBothBBChildIsBB() {
        DNA parent1DNA = createDNAMock(mockBB);
        DNA parent2DNA = createDNAMock(mockBB);

        DNA childDNA = DNA.combineSequences(parent1DNA, parent2DNA);
        for (Allele allele: Allele.values()) {
            AllelePair childPair = childDNA.getAllelePair(allele);

            assertEquals('B', childPair.getMaternalCopy());
            assertEquals('B', childPair.getPaternalCopy());
        }
    }

    @Test
    public void combineBothbbChildbb() {
        DNA parent1DNA = createDNAMock(mockbb);
        DNA parent2DNA = createDNAMock(mockbb);

        DNA childDNA = DNA.combineSequences(parent1DNA, parent2DNA);
        for (Allele allele: Allele.values()) {
            AllelePair childPair = childDNA.getAllelePair(allele);

            assertEquals('b', childPair.getMaternalCopy());
            assertEquals('b', childPair.getPaternalCopy());
        }
    }

}
