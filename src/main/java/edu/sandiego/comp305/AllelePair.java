package edu.sandiego.comp305;

import static java.lang.Character.*;

public class AllelePair {
    private char maternalCopy;
    private char paternalCopy;

    public AllelePair (char maternalCopy, char paternalCopy) {
        this.maternalCopy = maternalCopy;
        this.paternalCopy = paternalCopy;
    }

    public boolean isDominantExpressed () {

        if(isUpperCase(maternalCopy)) {
            return true;
        }
        return false;
    }

    public char getMaternalCopy () {
        return this.maternalCopy;
    }

    public char getPaternalCopy () {
        return this.paternalCopy;
    }
}
