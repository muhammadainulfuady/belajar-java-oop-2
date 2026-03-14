package innerClassV2;

public class Main {
    public static void main(String[] args) {
        Aplikasi.setNamaAplikasi("MyApp");
        Aplikasi.Fitur fitur1 = new Aplikasi.Fitur("Dark Mode", "l");
        fitur1.tampilInfo();
    }
}
