package week1.uncheckedexception;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String str = null;
        try {
            int length = str.length(); // This leads to NullPointerException
            System.out.println("Length: " + length);
        } catch (NullPointerException e) {
            System.err.println("NullPointerException: " + e.getMessage());
        }
    }
}
