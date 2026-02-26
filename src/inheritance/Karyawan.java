package inheritance;

public class Karyawan {
    protected String name;
    protected String nomorKaryawan;

    public Karyawan(String name, String nomorKaryawan) {
        this.name = name;
        this.nomorKaryawan = nomorKaryawan;
    }

    public String getNomorKaryawan() {
        return nomorKaryawan;
    }

    public void absensi() {
        System.out.println("Nama karyawan   : " + name);
        System.out.println("Nomor karyawan  : " + nomorKaryawan);
        System.out.println("Karyawan dengan nomer " + nomorKaryawan + " Melakukan absensi");
    }
}
