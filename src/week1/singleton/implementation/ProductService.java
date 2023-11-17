package week1.singleton.implementation;

// ProductService class
public class ProductService {
    private final Logger logger = Logger.getInstance();

    public void addProduct(String productName) {
        // Your product addition logic here
        System.out.println("This is call from productService class.");
        // Log the product addition
        logger.log("Product added: " + productName);
    }
}
