package edu.sandiego.comp305;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class DNATests {

    public AllelePair mockBB;
    public AllelePair mockBb;
    public AllelePair mockbB;
    public AllelePair mockbb;

    // helper method for the tests
    public DNA createDNAMock(AllelePair mockPair) {
        Map<Allele, AllelePair> traits = new HashMap<>();
        for(Allele allele: Allele.values()) {
            traits.put(allele, mockPair);
        }
        return new DNA(traits);
    }

}
