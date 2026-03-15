package exceptionApp;

public class Main {
    public static void main(String[] args) {
        Nilai nilai1 = new Nilai();
        try {
            nilai1.validateNilai(19);
        } catch (ValidateException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
