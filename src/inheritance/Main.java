package inheritance;

public class Main {
    public static void main(String[] args) {
        Karyawan k1 = new Karyawan("Lintang abadi", "209123");
        k1.absensi();
        Bos b1 = new Bos("Lintang pusaka", k1.getNomorKaryawan(), 20_000_000);
        b1.ngasih();
    }
}
