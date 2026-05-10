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

}
