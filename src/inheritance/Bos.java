package inheritance;

public class Bos extends Karyawan {
    protected int gajiKaryawan;

    public Bos(String name, String nomorKaryawan, int gajiKaryawan) {
        super(name, nomorKaryawan);
        this.gajiKaryawan = gajiKaryawan;
    }

    @Override
    public String getNomorKaryawan() {
        return super.getNomorKaryawan();
    }

    public void ngasih() {
        System.out.println("Nama bos : " + name);
        System.out.println("Bos melakukan pembayaran sebesar : " + gajiKaryawan + " Kepada karyawan yang ber nomor "
                + getNomorKaryawan());
    }

}
