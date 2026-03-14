package recordClassV2;

public record KartuIdentitas(String nama, String nik, int umur, String kota) {
    public KartuIdentitas {
        System.out.println("=== Kartu Identitas Digital ===");
    }

    public boolean isWargaDewasa() {
        if (umur >= 18) {
            return true;
        }
        return false;
    }
}
