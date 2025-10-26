package ua.edu.ucu.lab7.lab7.store;

public enum FlowerColor {
    /**
     * Flower colors.
     */
    RED("#FF0000"), YELLOW("#FFFF00"), BLUE("#0000FF");

    private final String stringRepresentation;

    FlowerColor(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }

    @Override
    public String toString() {
        return stringRepresentation;
    }
}
