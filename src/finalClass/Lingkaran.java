package finalClass;

public final class Lingkaran {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public String toString() {
        return "Jari-jari : " + jariJari;
    }

    public double hitungLuas() {
        double luas = Math.PI * Math.pow(jariJari, 2);
        return luas;
    }

    public double hitungKeliling() {
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}
