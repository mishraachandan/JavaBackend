package week1.singleton.implementation;

// UserManager class
public class UserManager {

    // We are getting an instance of logger.
    private final Logger logger = Logger.getInstance();

    public void createUser(String username) {
        String user = "Chandan";
        System.out.println("The is call from createuser class.");
        // Log the user creation
        logger.log("User created: " + username);
    }
}
