package exceptionApp.cara3;

public class Donor {
    private String nama;
    private int umur;
    private int beratBadan;

    // validasi langsung saat object dibuat!
    public Donor(String nama, int umur, int beratBadan) throws DonorException {
        this.nama = nama;
        setUmur(umur); // ← validasi umur
        setBeratBadan(beratBadan); // ← validasi berat badan
    }

    public void setUmur(int umur) throws DonorException {
        if (umur < 17 || umur > 60) {
            throw new DonorException(
                    nama + " (" + umur + " tahun, " + beratBadan + " kg) : Umur tidak memenuhi syarat!");
        }
        this.umur = umur;
    }

    public void setBeratBadan(int beratBadan) throws DonorException {
        if (beratBadan < 45) {
            throw new DonorException(
                    nama + " (" + umur + " tahun, " + beratBadan + " kg) : Berat badan tidak memenuhi syarat!");
        }
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

    // method tampil ada di class Donor sendiri
    public void tampilLayak() {
        System.out.println("✅ " + nama + " (" + umur + " tahun, " + beratBadan + " kg) : Layak donor!");
    }
}