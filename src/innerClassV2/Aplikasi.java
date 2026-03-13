package innerClassV2;

public class Aplikasi {
    private static String namaAplikasi;

    public static String getNamaAplikasi() {
        return namaAplikasi;
    }

    public static void setNamaAplikasi(String namaAplikasi) {
        Aplikasi.namaAplikasi = namaAplikasi;
    }

    public static class Fitur {
        private String namaFitur;
        private String status;

        public String getNamaFitur() {
            return namaFitur;
        }

        public void setNamaFitur(String namaFitur) {
            this.namaFitur = namaFitur;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            String lowerStatus = status.toLowerCase();
            if (!lowerStatus.equals("aktif") && !lowerStatus.equals("nonaktif")) {
                System.out.println("Status hanya boleh aktif dan nonaktif");
            } else {
                this.status = status;
            }
        }
    }
}
