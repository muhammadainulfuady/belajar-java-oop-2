package enumClass;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Info Planet ===");
        for (Planet p : Planet.values()) {
            p.infoJarak();
        }
    }
}
