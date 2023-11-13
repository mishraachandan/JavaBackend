package week1;

public class CustomException extends  RuntimeException{
        public CustomException(String message) {
            super(message);
        }

        public static void main(String[] args) {
            try {
                int result = divide(10, 0);
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.err.println("ArithmeticException: " + e.getMessage());
            } catch (Exception e) {
                System.err.println("Exception: " + e.getMessage());
            } finally {
                System.out.println("Cleanup code goes here");
            }
        }

        public static int divide(int dividend, int divisor) {
            if (divisor == 0) {
                throw new CustomException("Division by zero is not allowed.");
            }
            return dividend / divisor;
        }
}


