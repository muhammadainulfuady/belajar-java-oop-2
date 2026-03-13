package innerClass;

public class Main {
    public static void main(String[] args) {
        Toko toko1 = new Toko("Toko Sejahtera");
        Toko.Produk produk1 = toko1.new Produk("Laptop", 85_000_00);
        produk1.tampilInfo();
        toko1.setNamaToko("Toko Kelontong");
        produk1.tampilInfo();
    }
}
