package week1.singleton.implementation;

// Main class to demonstrate the usage
public class Main {
    public static void main(String[] args) {
        // Access the singleton logger instance
        Logger logger = Logger.getInstance();

        // Use the logger to log messages from different parts of the application
        logger.log("Application started");

        // Create a user using UserManager
        UserManager userManager = new UserManager();
        userManager.createUser("John Doe");

        // Add a product using ProductService
        ProductService productService = new ProductService();
        productService.addProduct("Smartphone");

        // Log a message from the main class
        logger.log("Application shutting down");
    }
}
