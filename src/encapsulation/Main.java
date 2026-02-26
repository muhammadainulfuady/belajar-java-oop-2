package encapsulation;
public class Main {
    public static void main(String[] args) {
        Termostat termostat1 = new Termostat(35);
        User user1 = new User("ainulfuady", "fuadi2006");
        Termostat suhu1 = new Termostat(26);
        suhu1.showSuhu();
        suhu1.setSuhu(20);
        suhu1.showSuhu();
    }
}
