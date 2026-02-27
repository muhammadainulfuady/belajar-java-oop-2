package encapsulation2;

public class Main {
    public static void main(String[] args) {
        AkunGame akun1 = new AkunGame("ShadowHunter", 5, 1000);
        akun1.setLevel(-2);
        akun1.setGold(-5);
        akun1.showAkunGame();
    }
}
