package edu.sandiego.comp305;

public class AllelePair {
    private char maternalCopy;
    private char paternalCopy;

    public AllelePair (char maternalCopy, char paternalCopy) {
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
