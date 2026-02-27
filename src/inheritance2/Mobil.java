package inheritance2;

public class Mobil extends Kendaraan {
    protected int jumlahPintu;

    public Mobil(String merk, double kecepatan, int jumlahPintu) {
        super(merk, kecepatan);
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    protected void tampilInfo() {
        super.tampilInfo();
        System.out.println("Jumlah Pintu    : " + jumlahPintu);
    }
}
