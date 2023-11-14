package week1.tasks;


//Your task is to complete the Calculator class by
//implementing the division method and handling the custom exception (DivisionByZeroException).
//In the CalculatorApp class, add more test cases, including scenarios where division by zero may occur.
public class Calculator {
    public static double divide(double dividend, double divisor) throws DivisionByZeroException {
        // Your code here: Implement division and handle the custom exception
        // If the divisor is zero, throw a custom exception named DivisionByZeroException
        // Otherwise, perform the division and return the result
        double result = 0.0;
        try{
            if(divisor == 0){
                throw new DivisionByZeroException("The Divisor is zero");
            }
            else{
                result = dividend / divisor;
            }
        }
        catch (DivisionByZeroException e){
            System.out.println(e.getMessage());
        }

        return result; // Placeholder, replace with actual result
    }
}

// Your custom exception class for division by zero
class DivisionByZeroException extends Exception {
    // Your code here: Customize the exception class if needed
    public DivisionByZeroException(String message){
        super(message);
    }

}

