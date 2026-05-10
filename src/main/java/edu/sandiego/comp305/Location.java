package edu.sandiego.comp305;

public enum Location {
    NYC ("New York", "NY", 0.2),
    LA ("Los Angeles", "CA",0.3),
    CHICAGO ("Chicago", "IL", 0.2),
    HOUSTON ("Houston", "TX", 0.4),
    PHOENIX ("Phoenix", "AZ", 0.5),
    SAN_DIEGO ("San Diego", "CAa" , 0.6),
    SEATTLE ("Seattle", "WA", 0.1),
    DENVER ("Denver", "CO", 0.5),
    BOSTON ("Boston", "MA", 0.6),
    MIAMI ("Miami", "FL", 0.8);

    private final String city;

    private final String state;

    private final double riskFactor;

    Location (final String city, final String state, final double riskFactor) {
        this.city = city;
        this.state = state;
        this.riskFactor = riskFactor;
    }

    public String getCity () { return this.city; }

    public String getState() { return this.state; }

    public double getRiskFactor() { return this.riskFactor; }

}
