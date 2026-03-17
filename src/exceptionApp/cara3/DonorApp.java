// DonorApp.java — tidak ada DonorValidasi sama sekali!
package exceptionApp.cara3;

public class DonorApp {
    public static void main(String[] args) {

        String[][] dataDonor = {
                { "Budi", "25", "65" },
                { "Ani", "15", "50" },
                { "Candra", "30", "40" },
                { "Doni", "65", "70" }
        };

        for (String[] data : dataDonor) {
            try {
                Donor donor = new Donor(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]));
                donor.tampilLayak(); // hanya dipanggil kalau valid!
            } catch (DonorException e) {
                System.out.println("❌ " + e.getMessage());
            }
        }
    }
}