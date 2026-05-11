package edu.sandiego.comp305;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class DNA {
    final Map<Allele, AllelePair> DNASequence;

    public DNA (final Map<Allele, AllelePair> DNASequence) {
        this.DNASequence = new HashMap<>(DNASequence);
    }

    public static DNA combineSequences (final DNA parent1,
                                                            final DNA parent2) {
        final Map<Allele, AllelePair> combined = new HashMap<>();
        Random rng = new Random();

        for(Allele allele: Allele.values()) {
            AllelePair parent1Pair = parent1.getAllelePair(allele);
            AllelePair parent2Pair = parent2.getAllelePair(allele);

            // randomly pick one copy from each parent for each allele (flips a coin)
            char fromParent1;
            char fromParent2;

            if(rng.nextBoolean()) {
                fromParent1 = parent1Pair.getMaternalCopy();
            }
            else {
                fromParent1 = parent1Pair.getPaternalCopy();
            }

            if(rng.nextBoolean()) {
                fromParent2 = parent2Pair.getMaternalCopy();
            }
            else {
                fromParent2 = parent2Pair.getPaternalCopy();
            }

            combined.put(allele, new AllelePair(fromParent1, fromParent2));
        }

        return new DNA(combined);
    }

    public static DNA generateRandomDNA(Random rng) {
        Map<Allele, AllelePair> DNASequence = new HashMap<>();

        for(Allele allele: Allele.values()) {
            DNASequence.put(allele, new AllelePair('B', 'B'));
        }
        return new DNA(DNASequence);
    }

    public static String calculatePhenotype () {
        return "";
    }

    public AllelePair getAllelePair(Allele allele) {
        return DNASequence.get(allele);
    }


}
