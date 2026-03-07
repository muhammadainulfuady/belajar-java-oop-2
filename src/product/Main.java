package product;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Macbook Pro", 30_000_000);
        Product product2 = new Product("Macbook Pro", 30_000_000);
        System.out.println(product1);
        
        System.out.println(product1.equals(product2));
    }
}
