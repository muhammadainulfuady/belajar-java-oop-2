package exceptionApp.cara1;

public class DonorValidasi {
    public void cekKelayakan(Donor donor) throws DonorException {
        int umur = donor.getUmur();
        String nama = donor.getNama();
        int beratBadan = donor.getBeratBadan();
        if (umur < 17 || umur > 60) {
            throw new DonorException(
                    nama + " (" + umur + " tahun, " + beratBadan + " kg) : Umur tidak memenuhi syarat!");
        } else if (beratBadan < 45) {
            throw new DonorException(
                    nama + " (" + umur + " tahun, " + beratBadan + " kg) : Berat badan tidak memenuhi syarat!");
        } else {
            System.out.println(nama + " (" + umur + " tahun, " + beratBadan + " kg) : Layak donor!");
        }
    }
}
