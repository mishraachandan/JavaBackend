package week1.singleton;

public class Singleton {
    // Step 1: Private static instance variable
    private static Singleton instance;

    // Step 2: Private constructor to prevent instantiation from outside
    private Singleton() {
        // Optional: You can add initialization code here
    }

    // Step 3: Public method to get the single instance of the class
    public static Singleton getInstance() {
        // Lazy Initialization: Create the instance if it doesn't exist yet
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Optional: Other methods of the singleton class
    public void performOperation() {
        System.out.println("Singleton is performing an operation.");
    }
}
