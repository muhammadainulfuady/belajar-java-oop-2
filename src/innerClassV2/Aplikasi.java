package innerClassV2;

public class Aplikasi {
    private static String namaAplikasi;

    public Aplikasi(String namaAplikasi) {
        Aplikasi.namaAplikasi = namaAplikasi;
    }

    public static String getNamaAplikasi() {
        return namaAplikasi;
    }

    public static void setNamaAplikasi(String namaAplikasi) {
        Aplikasi.namaAplikasi = namaAplikasi;
    }

    public static class Fitur {
        private String namaFitur;
        private String status;

        public Fitur(String namaFitur, String status) {
            this.namaFitur = namaFitur;
            setStatus(status);
        }

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
                this.status = "-";
            } else {
                this.status = status;
            }
        }

        public void tampilInfo() {
            System.out.println("=== Info Fitur ===");
            System.out.println("Aplikasi : " + namaAplikasi);
            System.out.println("Fitur    : " + namaFitur);
            System.out.println("Status   : " + status);
        }
    }
}
