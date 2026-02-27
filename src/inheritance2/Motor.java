package inheritance2;

public class Motor extends Kendaraan {
    protected String jenisMotor;

    public Motor(String merk, double kecepatan, String jenisMotor) {
        super(merk, kecepatan);
        this.jenisMotor = jenisMotor;
    }

    @Override
    protected void tampilInfo() {
        super.tampilInfo();
        System.out.println("Jenis Motor     : " + jenisMotor);
    }
}
