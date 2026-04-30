package edu.sandiego.comp305;

import java.util.Map;

public class DNA {
    final Map<Allele, AllelePair> DNASequence;

    public DNA (final Map<Allele, AllelePair> DNASequence) {
        this.DNASequence = DNASequence;
    }

    public static Map<Allele, AllelePair> combineSequences (final Map<Allele, AllelePair> parentOne,
                                                            final Map<Allele, AllelePair> parentTwo) {
        return null;
    }

    public static String calculatePhenotype () {
        return "";
    }

    public static double calculateDiseaseRisk () {
        return 0.0;
    }
}
