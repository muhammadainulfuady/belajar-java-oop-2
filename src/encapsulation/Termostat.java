package encapsulation;

public class Termostat {
    // private menandakan bahwa ini adalah encapsulation
    private double suhu;

    public Termostat(double suhu) {
        setSuhu(suhu);
    }

    void setSuhu(double suhuBaru) {
        if (suhuBaru >= 10 && suhuBaru <= 35) {
            this.suhu = suhuBaru;
        } else {
            System.out.println("Suhu diluar batas aman!!");
        }
    }

    public double getSuhu() {
        return this.suhu;
    }

    public void updateSuhu(double suhuBaru) {
        this.suhu = suhuBaru;
    }

    public void showSuhu() {
        System.out.println("Suhu saat ini adalah : " + getSuhu());
    }
}
