package edu.sandiego.comp305;

import static java.lang.Character.*;

public class AllelePair {
    final private char maternalCopy;

    final private char paternalCopy;

    public AllelePair (final char maternalCopy, final char paternalCopy) {
        this.maternalCopy = maternalCopy;
        this.paternalCopy = paternalCopy;
    }

    public boolean isDominantExpressed () {
        return isUpperCase(maternalCopy) || isUpperCase(paternalCopy);
    }

    public char getMaternalCopy () {
        return this.maternalCopy;
    }

    public char getPaternalCopy () {
        return this.paternalCopy;
    }
}
