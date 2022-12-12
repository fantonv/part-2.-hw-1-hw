public class Main {
    public static void main(String[] args) {
        Human Ann = new Human(1993, null, "Moscow", "methodologist of educational programs");
        Human Max = new Human(1988, "Max", "Minsk", "brand manager");
        Human Kate = new Human(1992, "Kate", "Kaliningrad", "production manager");
        Human Artem = new Human(1995, "Artem", "Moscow", "business development director");

        System.out.println(Ann.toString());
        System.out.println(Max.toString());
        System.out.println(Kate.toString());
        System.out.println(Artem.toString());

        Car Granta = new Car("Lada", "Granta",1.7d,"yellow", 2015, "Russia");
        Car Avante = new Car("Hyndai", "Avante",1.6d,
                "orange", 2016, "South Korea");
        Car A8 = new Car("Audi", "A8 50 L TDI quattro", 3.0d, "black",
                2020, "Germany");
        Car Z8 = new Car("BMW", null, 3.0d, "black", 2021, "Germany");
        Car Sportage = new Car("KIA", "Sportage", 2.4d,
                "red", 2018, "South Korea");

        System.out.println(Granta.toString());
        System.out.println(Avante.toString());
        System.out.println(A8.toString());
        System.out.println(Z8.toString());
        System.out.println(Sportage.toString());

    }
}