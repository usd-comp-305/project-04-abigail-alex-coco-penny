package edu.sandiego.comp305;

public enum Age {
    CHILD (0.0),
    YOUNG_ADULT (0.8),
    ADULT (0.4),
    SENIOR (0.6);

    private final double riskFactor;

    Age (final double riskFactor) {
        this.riskFactor = riskFactor;
    }

    public double getRiskFactor() { return this.riskFactor; }
}
