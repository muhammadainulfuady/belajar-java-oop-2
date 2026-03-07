package product;

public class Product {
    public String name;
    public int harga;

    public Product(String name, int harga) {
        this.name = name;
        this.harga = harga;
    }

    @Override
    public String toString() {
        return "Product name: " + name + ", Price " + harga;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Product p = (Product) obj;

        return this.harga == p.harga &&
                this.name.equals(p.name);
    }
}
