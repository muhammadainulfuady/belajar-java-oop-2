package product2;

public class Main {

    public static void main(String[] args) {
        Produk p1 = new Produk("P01", "Laptop");
        Produk p2 = new Produk("P01", "Laptop");

        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode() == p2.hashCode());
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
    }
}
