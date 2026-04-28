package edu.sandiego.comp305;

public class DNA {
    Map<Allele, AllelePair> DNASequence;

    public DNA (Map<Allele, AllelePair> DNASequence) {
        this.DNASequence = DNASequence;
    }

    public static Map<Allele, AllelePair> combineSequences (Map<Allele, AllelePair> parentOne, Map<Allele, AllelePair> parentTwo) {
        return null;
    }

    public static String calculatePhenotype () {
        return "";
    }

    public static double calculateDiseaseRisk () {
        return 0.0;
    }
}
