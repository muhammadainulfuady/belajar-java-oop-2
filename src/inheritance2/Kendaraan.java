package inheritance2;

public class Kendaraan {
    protected String merk;
    protected double kecepatan;

    public Kendaraan(String merk, double kecepetan) {
        this.merk = merk;
        this.kecepatan = kecepetan;
    }

    protected void tampilInfo() {
        System.out.println("Merk            : " + merk);
        System.out.println("Kecepatan       : " + kecepatan + " km/jam");
    }
}
