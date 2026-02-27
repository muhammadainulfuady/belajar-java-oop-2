package encapsulation2;

public class AkunGame {
    private String username;
    private int level;
    private int gold;

    public AkunGame(String username, int level, int gold) {
        setUsername(username);
        setLevel(level);
        setGold(gold);
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setLevel(int level) {
        if (level <= 0) {
            System.out.println("Level tidak valid!");
        } else {
            this.level = level;
        }
    }

    public void setGold(int gold) {
        if (gold < 0) {
            System.out.println("Gold tidak boleh negatif!");
        } else {
            this.gold = gold;
        }
    }

    public String getUsername() {
        return username;
    }

    public int getLevel() {
        return level;
    }

    public int getGold() {
        return gold;
    }

    public void showAkunGame() {
        System.out.println("\n=== DATA AKUN GAME ===");
        System.out.println("Username        : " + username);
        System.out.println("Level           : " + level);
        System.out.println("Gold            : " + gold);
    }
}
