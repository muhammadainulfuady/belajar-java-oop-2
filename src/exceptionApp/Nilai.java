package exceptionApp;

public class Nilai {
    private int nilai;

    public void validateNilai(int nilai) throws ValidateException, NumberFormatException {
        if (nilai < 0 || nilai > 100) {
            throw new ValidateException("Error : Nilai tidak valid! Nilai harus antara 0 - 100. Input kamu : " + nilai);
        } else {
            System.out.println("Nilai " + nilai + " valid!");
        }
    }
}