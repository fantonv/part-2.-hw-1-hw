import transport.Car;

import java.time.LocalDate;
import java.time.Month;
public class Main {

    public static void changeTire(){
        LocalDate current_date = LocalDate.now();
        Month monthNumber = current_date.getMonth();
        System.out.println(monthNumber);
    }
    public static void main(String[] args) {
        Human Ann = new Human(1993, "Ann", "Moscow", "methodologist of educational programs");
        Human Max = new Human(1988, "Max", "Minsk", "brand manager");
        Human Kate = new Human(1992, "Kate", "Kaliningrad", "production manager");
        Human Artem = new Human(1995, "Artem", "Moscow", "business development director");
        Human Vladimir = new Human(2001, "Vladimir", "Kazan", "unemployed");


        Ann.setYearOfBirth(-20);
        Ann.setName(null);

        System.out.println(Ann.toString());
        System.out.println(Max.toString());
        System.out.println(Kate.toString());
        System.out.println(Artem.toString());
        System.out.println(Vladimir.toString());

        Flower Rose = new Flower("Simple Rose", "Holland", 35.59, null);
        Flower Chrysanthemum = new Flower("Chrysanthemum", null, 15, "5 days");
        Flower Peony = new Flower("Peony", "England", 69.9, "1 day");
        Flower Gypsophila = new Flower("Gypsophila", "Turkey", 19.5, "10 day");
        System.out.println(Rose.toString());
        System.out.println(Chrysanthemum.toString());
        System.out.println(Peony.toString());
        System.out.println(Gypsophila.toString());

        Car Granta = new Car("Lada", "Granta",1.7d,"yellow",
                2015, "Russia", "mechanical", "sedan", "cv001y1111",
                5, false);
        Car Avante = new Car("Hyndai", "Avante",1.6d,
                "orange", 2016, "South Korea", "auto","sedan",
                "we323we222",5, false);
        Car A8 = new Car("Audi", "A8 50 L TDI quattro", 3.0d, "black",
                2020, "Germany","auto",
                "sedan", "as331sd324", 5, true);
        Car Z8 = new Car("BMW", null, 3.0d, "black", 2021, "Germany",
                "auto","coupe", "ew2342r1231", 3, false);
        Car Sportage = new Car("KIA", "Sportage", 2.4d,
                "red", 2018, "South Korea", "auto",
                "crossover","ew232qe123", 6, true);

        Car.Insurance SportageIns = new Car.Insurance(null, 111, "123321");

        System.out.println(Sportage.toString());
        Sportage.changeTyres();
        System.out.println(Granta.isValidNumber());

        SportageIns.checkInsExp();

    }
}