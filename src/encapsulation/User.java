package encapsulation;

public class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return this.username;
    }

    public void updatePassword(String passLama, String passBaru) {
        if (passLama.equals(password)) {
            this.password = passBaru;
        } else {
            System.out.println("Gagal ganti password!");
        }
    }
}
