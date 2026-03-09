package product2;

public class Produk {
    public String kodeProduk;
    public String namaProduk;

    public Produk(String kodeProduk, String namaProduk) {
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((kodeProduk == null) ? 0 : kodeProduk.hashCode());
        result = prime * result + ((namaProduk == null) ? 0 : namaProduk.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produk other = (Produk) obj;
        if (kodeProduk == null) {
            if (other.kodeProduk != null)
                return false;
        } else if (!kodeProduk.equals(other.kodeProduk))
            return false;
        if (namaProduk == null) {
            if (other.namaProduk != null)
                return false;
        } else if (!namaProduk.equals(other.namaProduk))
            return false;
        return true;
    }
}
