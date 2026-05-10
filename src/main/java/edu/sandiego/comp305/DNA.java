package edu.sandiego.comp305;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DNA {
    final Map<Allele, AllelePair> DNASequence;

    public DNA (final Map<Allele, AllelePair> DNASequence) {
        this.DNASequence = new HashMap<>(DNASequence);
    }

    public static DNA combineSequences (final DNA parent1,
                                                            final DNA parent2) {
        final Map<Allele, AllelePair> combined = new HashMap<>();

        for(Allele allele: Allele.values()) {
            AllelePair parent1Pair = parent1.getAllelePair(allele);
            AllelePair parent2Pair = parent2.getAllelePair(allele);

            combined.put(allele, new AllelePair(parent1Pair.getMaternalCopy(), parent2Pair.getPaternalCopy()));
        }

        return new DNA(combined);
    }

    public static String calculatePhenotype () {
        return "";
    }

    public AllelePair getAllelePair(Allele allele) {
        return DNASequence.get(allele);
    }


}
