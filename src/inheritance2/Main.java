package inheritance2;

public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Toyota", 180, 4);
        System.out.println("=== DATA MOBIL ===");
        mobil1.tampilInfo();

        Motor motor1 = new Motor("Yamahaa", 120, "Sport");
        System.out.println("\n=== DATA MOTOR ===");
        motor1.tampilInfo();
    }
}
