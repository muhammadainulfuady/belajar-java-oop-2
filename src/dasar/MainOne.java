package dasar;

class MainOne {
    public static void main(String[] args) {

        String sandi = "Belajar123";

        checkPassword(sandi);

    }

    public static void checkPassword(String password) {

        System.out.println("=== Cek Kekuatan Password ===");
        System.out.println("Password   : " + password);

        boolean panjangOK = password.length() >= 8;
        boolean adaAngka = false;
        boolean hurufBesar = false;

        // loop untuk mengecek tiap karakter
        for (int i = 0; i < password.length(); i++) {

            char c = password.charAt(i);
            System.out.println(c);

            if (Character.isDigit(c)) {
                adaAngka = true;
            }

            if (Character.isUpperCase(c)) {
                hurufBesar = true;
            }
        }

        int skor = 0;

        if (panjangOK)
            skor++;
        if (adaAngka)
            skor++;
        if (hurufBesar)
            skor++;

        String status;

        if (skor <= 1) {
            status = "LEMAH";
        } else if (skor == 2) {
            status = "SEDANG";
        } else {
            status = "KUAT 💪";
        }

        System.out.println("Panjang OK : " + panjangOK);
        System.out.println("Ada Angka  : " + adaAngka);
        System.out.println("Huruf Besar: " + hurufBesar);
        System.out.println("Skor       : " + skor + "/3");
        System.out.println("Status     : " + status);
    }
}