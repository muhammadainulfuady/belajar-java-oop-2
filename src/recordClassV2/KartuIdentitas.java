package recordClassV2;

public record KartuIdentitas(String nama, String nik, int umur, String kota) {
    public KartuIdentitas {
        System.out.println("\n=== Kartu Identitas Digital ===");
    }

    public String isWargaDewasa() {
        return umur >= 18 ? "Dewasa" : "Belum Dewasa";
    }
}
