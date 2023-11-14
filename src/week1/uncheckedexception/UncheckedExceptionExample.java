package week1.uncheckedexception;


public class UncheckedExceptionExample {

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3 };
        try {
            int result = numbers[5]; // This leads to ArrayIndexOutOfBoundsException
            System.out.println("Result: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}

