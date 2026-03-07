package product2;

public class Main {

    public static void main(String[] args) {
        Produk p1 = new Produk("P01", "Laptop");
        Produk p2 = new Produk("P01", "Laptop");

        if (p1.equals(p2)) {
            System.out.println("Produk sama");
        } else {
            System.out.println("Produk berbeda");
        }

        String satu = "10";
        System.out.println(satu.hashCode());
    }
}
