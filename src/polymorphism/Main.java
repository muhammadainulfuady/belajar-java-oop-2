package polymorphism;

public class Main {
    public static void main(String[] args) {
        Karakter[] karakters = {
                new Warrior(), new Mage(), new Archer()
        };

        for (Karakter k : karakters) {
            k.serang();
        }
    }
}
