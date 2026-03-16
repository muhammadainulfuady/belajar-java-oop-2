package exceptionApp.cara1;

public class DonorApp {
    public static void main(String[] args) {
        Donor donor1 = new Donor("budi", 19, 99);
        DonorValidasi validasiDonor = new DonorValidasi();

        try {
            validasiDonor.cekKelayakan(donor1);
        } catch (DonorException e) {
            System.out.println(e.getMessage());
        }
    }
}
