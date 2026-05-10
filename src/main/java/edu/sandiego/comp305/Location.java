package edu.sandiego.comp305;

public enum Location {
    MIAMI ("Miami", "FL", 0.9),
    NEW_YORK ("New York", "NY", 0.8),
    PHILADELPHIA ("Philadelphia", "PA",0.7),
    CHICAGO ("Chicago", "IL", 0.7),
    HOUSTON ("Houston", "TX", 0.5),
    BOSTON ("Boston", "MA", 0.4),
    PHOENIX ("Phoenix", "AZ", 0.4),
    SAN_DIEGO ("San Diego", "CAa" , 0.3),
    DENVER ("Denver", "CO", 0.3),
    SEATTLE ("Seattle", "WA", 0.2);

    private final String city;

    private final String state;

    private final double riskFactor;

    Location (final String city, final String state, final double riskFactor) {
        this.city = city;
        this.state = state;
        this.riskFactor = riskFactor;
    }

    public String getCity () {
        return this.city; }

    public String getState() {
        return this.state; }

    public double getRiskFactor() {
        return this.riskFactor; }

}
