public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;

    Car(String brand, String model, double engineVolume, String color, int year, String country) {
        if (brand == null || brand == ""){
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model == "") {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (country == null || country == "") {
            this.country = "default";
        } else {
            this.country = country;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5d;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null || color == "") {
            this.color = "default";
        } else {
            this.color = color;
        }
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public double getEngineVolume() {
        return this.engineVolume;
    }

    public String getColor() {
        return this.color;
    }

    public int getYear() {
        return this.year;
    }

    public String getCountry() {
        return this.country;
    }

    @Override
    public String toString() {
        return this.brand + " " + this.model + ", " + this.year + " year of production, " + this.country + " country of production, " +
                this.color + " color, " + this.engineVolume + " engine volume.";
    }
}
