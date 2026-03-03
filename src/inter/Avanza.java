package inter;

public class Avanza implements Car {

    @Override
    public void drive() {
        System.out.println("Mengemudi avanza");
    }

    @Override
    public int getTire() {
        return 4;
    }
}