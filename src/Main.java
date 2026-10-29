public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("GLE", "Toyota", 2022, 350_000, "White", 5);
        Car car2 = new Car("HQF", "Toyota", 2026, 250_000, "Silver", 3);
        System.out.println("Car 1: " + car1);
        System.out.println("Car 2: " + car2);
        System.out.println("The color of car1: " + car1.getColor());
        int year = car1.getYear();
        car1.setColor("Black");
        System.out.println("Are these objects equal? " + car1.equals(car2));
        System.out.println("Do they have the same hashCode? " + (car1.hashCode() == car2.hashCode()));
        System.out.println("The hashCode for car1 is: " + car1.hashCode());
        System.out.println("The hashCode for car2 is: " + car2.hashCode());
    }
}
