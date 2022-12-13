import java.time.LocalDate;

public class Flower {
    final String flowerName;
    final String country;
    final double cost;
    private String lifeSpan;

    Flower(String flowerName, String country, double cost, String lifeSpan) {
        if (flowerName == null || flowerName.isEmpty() || flowerName.isBlank()) {
            this.flowerName = "Flower type not specified";
        } else {
            this.flowerName = flowerName;
        }
        if (country == null || country.isEmpty() || country.isBlank()) {
            this.country = "Russia";
        } else {
            this.country = country;
        }
        if (cost >= 0) {
            this.cost = cost;
        } else {
            this.cost = 1d;
        }
        if (lifeSpan == null || lifeSpan.isEmpty() || lifeSpan.isBlank()) {
            this.lifeSpan = "3 days";
        } else {
            this.lifeSpan = lifeSpan;
        }
    }

    public String getFlowerName() {
        return flowerName;
    }

    public String getCountry() {
        return country;
    }

    public double getCost() {
        return cost;
    }

    public String getLifeSpan() {
        return lifeSpan;
    }


    @Override
    public String toString() {
        return "Name: " + getFlowerName() + String.format("%n") +
                "Country: " + getCountry() + String.format("%n") +
                "Cost: " + String.format("%.2f", getCost()) + String.format("%n") +
                "Life Span: " + getLifeSpan() + String.format("%n");
    }
}
