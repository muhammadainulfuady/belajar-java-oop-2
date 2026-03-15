package enumClass;

public enum Planet {
    MERKURIUS(57),
    VENUS(108),
    BUMI(150),
    MARS(228);

    private final int jarakDariMatahari;

    Planet(int jarakDariMatahari) {
        this.jarakDariMatahari = jarakDariMatahari;
    }

    public int getJarakDariMatahari() {
        return jarakDariMatahari;
    }

    public void infoJarak() {
        System.out.println(name() + " : Jarak dari Matahari: " + jarakDariMatahari + " juta km");
    }
}