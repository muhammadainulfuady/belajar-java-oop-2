package innerClass;

public class Toko {
    private String namaToko;

    public Toko(String namaToko) {
        this.namaToko = namaToko;
    }

    public String getNamaToko() {
        return namaToko;
    }

    public void setNamaToko(String namaToko) {
        this.namaToko = namaToko;
    }

    public class Produk {
        private String namaProduk;
        private int harga;

        public Produk(String namaProduk, int harga) {
            this.namaProduk = namaProduk;
            this.harga = harga;
        }

        public String getNamaProduk() {
            return namaProduk;
        }

        public void setNamaProduk(String namaProduk) {
            this.namaProduk = namaProduk;
        }

        public int getHarga() {
            return harga;
        }

        public void setHarga(int harga) {
            this.harga = harga;
        }

        public void tampilInfo() {
            System.out.println("=== Info Produk ===");
            System.out.println("Toko    :  " + namaToko);
            System.out.println("Produk  :  " + namaProduk);
            System.out.println("Harga   :  " + harga);
        }
    }
}