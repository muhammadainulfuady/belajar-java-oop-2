package inter;

public interface Car extends Brand, Maintenance {
    void drive();

    int getTire();
}