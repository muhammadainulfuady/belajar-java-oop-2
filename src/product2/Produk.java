package product2;

public class Produk {
    public String kodeProduk;
    public String namaProduk;

    public Produk(String kodeProduk, String namaProduk) {
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Produk p = (Produk) obj;

        return this.kodeProduk.equals(p.kodeProduk) && this.namaProduk.equals(p.namaProduk);
    }
}
