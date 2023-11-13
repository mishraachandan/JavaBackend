package week1;

public class SimpleException {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("An error occurred" + e.getLocalizedMessage());
//            System.err.println("An error occurred: " + e.getMessage());
        }
    }

    public static int divide(int dividend, int divisor) {
        return dividend / divisor;
    }
}
