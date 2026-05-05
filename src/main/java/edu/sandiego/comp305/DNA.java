package edu.sandiego.comp305;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DNA {
    final Map<Allele, AllelePair> DNASequence;

    public DNA (final Map<Allele, AllelePair> DNASequence) {
        this.DNASequence = new HashMap<>(DNASequence);
    }

    public static Map<Allele, AllelePair> combineSequences (final Map<Allele, AllelePair> parent1,
                                                            final Map<Allele, AllelePair> parent2) {
        final Map<Allele, AllelePair> combined = new HashMap<>();

        return Collections.unmodifiableMap(combined);
    }

    public static String calculatePhenotype () {
        return "";
    }

    public static double calculateDiseaseRisk () {
        return 0.0;
    }
}
