package week1.uncheckedexception;

public class ClassCastExceptionExample {
    public static void main(String[] args) {
        try {
            Object obj = "Hello";
            Integer number = (Integer) obj; // This leads to ClassCastException
            System.out.println("Number: " + number);
        } catch (ClassCastException e) {
            System.err.println("ClassCastException: " + e.getMessage());
        }
    }
}
