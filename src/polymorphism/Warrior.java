package polymorphism;

public class Warrior extends Karakter{
    @Override
    protected void serang() {
        System.out.println("Warrior menyerang dengan pedang!");
    }
}
