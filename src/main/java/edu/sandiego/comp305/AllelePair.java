package edu.sandiego.comp305;

public class AllelePair {
    final private char maternalCopy;
    final private char paternalCopy;

    public AllelePair (final char maternalCopy, final char paternalCopy) {
        this.maternalCopy = maternalCopy;
        this.paternalCopy = paternalCopy;
    }

    public static boolean isDominantExpressed () {
        return true;
    }

    public char getMaternalCopy () {
        return this.maternalCopy;
    }

    public char getPaternalCopy () {
        return this.paternalCopy;
    }
}
