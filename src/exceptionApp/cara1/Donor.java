package exceptionApp.cara1;

public class Donor {
    private String nama;
    private int umur;
    private int beratBadan;

    public Donor(String nama, int umur, int beratBadan) {
        this.nama = nama;
        this.umur = umur;
        this.beratBadan = beratBadan;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public int getBeratBadan() {
        return beratBadan;
    }

}
