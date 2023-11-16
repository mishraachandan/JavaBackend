package week1.singleton.implementation;

// UserManager class
public class UserManager {
    private Logger logger = Logger.getInstance();

    public void createUser(String username) {
        // Your user creation logic here

        // Log the user creation
        logger.log("User created: " + username);
    }
}
