package week1.tasks;

// Example of using the Calculator class
public class CalculatorApp {
    public static void main(String[] args) {
        try {
            double result = Calculator.divide(10.0, 0);
            System.out.println("Result: " + result);

            // Your code here: Add more test cases, including division by zero
        } catch (DivisionByZeroException e) {
            System.err.println("DivisionByZeroException: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
