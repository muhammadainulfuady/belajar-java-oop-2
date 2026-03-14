package recordClassV2;

public class Main {
    public static void main(String[] args) {
        KartuIdentitas k1 = new KartuIdentitas("Budi Santoso", "3201234567890001", 25, "Bandung");
        System.out.println("Nama    : " + k1.nama());
        System.out.println("Nik     : " + k1.nik());
        System.out.println("Umur    : " + k1.umur());
        System.out.println("Kota    : " + k1.kota());
        System.out.println("Status  : " + k1.isWargaDewasa());

        KartuIdentitas k2 = new KartuIdentitas("Ani Putri", "3201234567890002", 15, "Jakarta");
        System.out.println("Nama    : " + k2.nama());
        System.out.println("Nik     : " + k2.nik());
        System.out.println("Umur    : " + k2.umur());
        System.out.println("Kota    : " + k2.kota());
        System.out.println("Status  : " + k2.isWargaDewasa());
    }
}
