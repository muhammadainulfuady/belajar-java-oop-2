package equals;

public class EqualsApp {
    public static void main(String[] args) {
        String first = "Ainul";
        first = first + " " + "Fuady";
        String second = "Ainul Fuady";
        System.out.println(first);
        System.out.println(second);

        // menggunakan equals akan menghasilkan true karena fungsi ini membandingkan
        // isinya
        System.out.println(first.equals(second));

        // menggunakan == akan menghasilkan fale karena fungsi ini membandingkan
        // objectnya
        System.out.println(first == second);

        String tes1 = "tes1";
        String tes2 = "tes1";

        System.out.println(tes1 == tes2);

    }
}
