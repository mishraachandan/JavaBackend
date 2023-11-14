package week1.uncheckedexception;

public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // This leads to ArithmeticException
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.err.println("ArithmeticException: " + e.getMessage());
        }
    }
}

