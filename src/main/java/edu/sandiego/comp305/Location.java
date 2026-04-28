package edu.sandiego.comp305;

public class Location {
    private String city;
    private String state;

    public Location (String city, String state) {
        this.city = city;
        this.state = state;
    }

    public String getCity () {
        return this.city;
    }

    public String getState() {
        return this.state;
    }
}
