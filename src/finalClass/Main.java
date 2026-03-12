package finalClass;

public class Main {
    public static void main(String[] args) {
        Lingkaran lingkaran1 = new Lingkaran(7.0);
        System.out.println("=== Info Lingkaran ===");
        System.out.println(lingkaran1);
        System.out.println("Luas      : " + lingkaran1.hitungLuas());
        System.out.println("Keliling  : " + lingkaran1.hitungKeliling());
    }
}
