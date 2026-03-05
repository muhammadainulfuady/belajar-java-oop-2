package inter;

public class Main {
    public static void main(String[] args) {
        Car car = new Avanza();
        car.drive();
        System.out.println("Kecepatan : " + car.getTire());
        System.out.println("Merek : " + car.getBrand());
        System.out.println("Kerusakan ? : " + car.isMaintenance());
    }
}