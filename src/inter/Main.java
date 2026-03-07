package inter;

public class Main {
    public static void main(String[] args) {
        Car car = new Avanza();
        Car bus = new Bus();
        car.drive();
        System.out.println("Kapasitas : " + car.getTire());
        System.out.println("Merek : " + car.getBrand());
        System.out.println("Kerusakan ? : " + car.isMaintenance());
        System.out.println("Ukuran besar ? kecil : " + car.isBig());

        System.out.println("");

        bus.drive();
        System.out.println("Kapasitas : " + bus.getTire());
        System.out.println("Merek : " + bus.getBrand());
        System.out.println("Kerusakan ? : " + bus.isMaintenance());
        System.out.println("Ukuran besar ? kecil : " + bus.isBig());

    }
}