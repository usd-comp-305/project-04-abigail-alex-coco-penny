package edu.sandiego.comp305;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class DNA {

    private static final char DOMINANT_COPY = 'B';

    private static final char RECESSIVE_COPY = 'b';

    final Map<Allele, AllelePair> DNASequence;

    public DNA (final Map<Allele, AllelePair> DNASequence) {
        this.DNASequence = new HashMap<>(DNASequence);
    }

    public static DNA combineSequences (final DNA parent1,
                                                            final DNA parent2, final Random rng) {
        final Map<Allele, AllelePair> combined = new HashMap<>();

        for(Allele allele: Allele.values()) {
            final AllelePair parent1Pair = parent1.getAllelePair(allele);
            final AllelePair parent2Pair = parent2.getAllelePair(allele);

            // randomly pick one copy from each parent for each allele (flips a coin)
            final char fromParent1;
            final char fromParent2;

            if(rng.nextBoolean()) {
                fromParent1 = parent1Pair.getMaternalCopy();
            } else {
                fromParent1 = parent1Pair.getPaternalCopy();
            }

            if(rng.nextBoolean()) {
                fromParent2 = parent2Pair.getMaternalCopy();
            } else {
                fromParent2 = parent2Pair.getPaternalCopy();
            }

            combined.put(allele, new AllelePair(fromParent1, fromParent2));
        }

        return new DNA(combined);
    }

    public static DNA generateRandomDNA(final Random rng) {
        final Map<Allele, AllelePair> traits = new HashMap<>();
        final char[] options = {DOMINANT_COPY, RECESSIVE_COPY};

        for(Allele allele: Allele.values()) {
            traits.put(allele, new AllelePair(options[rng.nextInt(2)], options[rng.nextInt(2)]));
        }
        return new DNA(traits);
    }

    public String calculatePhenotypeFromAllele (final Allele allele) {
        final AllelePair pair = this.DNASequence.get(allele);

        if(pair.isDominantExpressed()) {
            return allele.getDominantTrait();
        } else {
            return allele.getRecessiveTrait();
        }
    }

    public AllelePair getAllelePair(final Allele allele) {
        return DNASequence.get(allele);
    }


}
