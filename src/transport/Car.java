package transport;

import java.time.LocalDate;
import java.time.Month;

public class Car {
    final String brand;
    final String model;
    private double engineVolume;
    private String color;
    final int year;
    final String country;
    private String transmission;
    final String carType;
    private String number;
    final int amountOfSits;
    private boolean summerTyres;

    private Key key;
    private Insurance insurance;

        public Car(String brand, String model, double engineVolume, String color, int year, String country,
                   String transmission, String carType, String number, int amountOfSits, boolean summerTyres) {
            if (brand == null || brand.isEmpty()) {
                this.brand = "default";
            } else {
                this.brand = brand;
            }
            if (model == null || model.isEmpty()) {
                this.model = "default";
            } else {
                this.model = model;
            }
            if (country == null || country.isEmpty()) {
                this.country = "default";
            } else {
                this.country = country;
            }
            if (engineVolume <= 0) {
                this.engineVolume = 1.5d;
            } else {
                this.engineVolume = engineVolume;
            }
            if (color == null || color.isEmpty()) {
                this.color = "default";
            } else {
                this.color = color;
            }
            if (year <= 0) {
                this.year = 2000;
            } else {
                this.year = year;
            }
            if (transmission == null || transmission.isEmpty()) {
                this.transmission = "Write information";
            } else {
                this.transmission = transmission;
            }
            if (carType == null || carType.isEmpty()) {
                this.carType = "Write information";
            } else {
                this.carType = carType;
            }
            if (number == null || number.isEmpty()) {
                this.number = "x000xx000";
            } else {
                this.number = number;
            }
            if (amountOfSits >= 0) {
                this.amountOfSits = amountOfSits;
            } else {
                this.amountOfSits = 1;
            }
            this.summerTyres = summerTyres;
            if (key == null) {
                this.key = new Key();
            } else {
                this.key = key;
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

        public String getTransmission() {
            return transmission;
        }

        public String getCarType() {
            return carType;
        }

        public String getNumber() {
            return number;
        }

        public int getAmountOfSits() {
            return amountOfSits;
        }

        public boolean isSummerTyres() {
            return summerTyres;
        }

        public void setSummerTyres(boolean summerTyres) {
            this.summerTyres = summerTyres;
        }

        public void changeTyres() {
            setSummerTyres(!summerTyres);
        }


        public boolean isValidNumber() {
//"x000xx000"
            boolean result = true;

            result = result && number.length() == 9;
            result = result && Character.isLetter(0);
            result = result && Character.isDigit(1);
            result = result && Character.isDigit(2);
            result = result && Character.isDigit(3);
            result = result && Character.isLetter(4);
            result = result && Character.isLetter(5);
            result = result && Character.isDigit(6);
            result = result && Character.isDigit(7);
            result = result && Character.isDigit(8);

            return result;
        }


        @Override
        public String toString() {
            return "Car:" + String.format("%n") +
                    "Brand: " + brand + String.format("%n") +
                    "Model: " + model + String.format("%n") +
                    "Engine volume: " + engineVolume + String.format("%n") +
                    "Color: " + color + String.format("%n") +
                    "Year: " + year + String.format("%n") +
                    "Country: " + country + String.format("%n") +
                    "Transmission: " + transmission + String.format("%n") +
                    "Car type: " + carType + String.format("%n") +
                    "Car number: " + number + String.format("%n") +
                    "Amount of seats: " + amountOfSits + String.format("%n") +
                    "Summer tyres: " + isSummerTyres() + String.format("%n");
        }

    public static class Key {
        private final boolean remoteStart;
        private final boolean keylessEntry;

        public Key(boolean remoteStart, boolean keylessEntry) {
            this.remoteStart = remoteStart;
            this.keylessEntry = keylessEntry;
        }

        public Key() {
            this.remoteStart = false;
            this.keylessEntry = false;
        }

        public boolean isRemoteStart() {
            return remoteStart;
        }

        public boolean isKeylessEntry() {
            return keylessEntry;
        }
    }
    public static class Insurance {
        private LocalDate expireDay;
        private final double cost;
        private final String number;

        public Insurance(LocalDate expireDay, double cost, String number) {
            if (expireDay == null) {
                this.expireDay = LocalDate.now().plusDays(270);
            } else {
                this.expireDay = expireDay;
            }
            this.cost = cost;
            if (number == null) {
                this.number = "123456789";
            } else {
                this.number = number;
            }
        }
        public LocalDate getExpireDay() {
            return expireDay;
        }

        public Insurance() {
            this(null, 111, null);
        }

        public void setExpireDay(LocalDate expireDay) {
            this.expireDay = expireDay;
        }

        public double getCost() {
            return cost;
        }


        public String getNumber() {
            return number;
        }

        public void checkInsExp() {
            if (expireDay.isBefore(LocalDate.now()) || expireDay.equals(LocalDate.now())) {
                System.out.println("Renew your insurance!");
            } else {
                System.out.println("it's ok!");
            }
        }


        public void checkNumInsur() {
            if (number.length() != 9) {
                System.out.println("incorrect number!");
            } else {
                System.out.println("it's ok!");
            }
        }
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }
}




