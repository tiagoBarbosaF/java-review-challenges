package challenge.two.models;

public class Shopping implements Comparable<Shopping> {
    private final String description;
    private final double value;

    public Shopping(String description, double value) {
        this.description = description;
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Shopping\n" +
                "Description: " + description +
                "\nValue: " + value;
    }

    @Override
    public int compareTo(Shopping otherShopping) {
        return Double.compare(this.value, otherShopping.value);
    }
}
