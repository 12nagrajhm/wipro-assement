import java.util.Optional;

// Define the UserService interface
@FunctionalInterface
interface UserService {
    // Abstract method that returns an Optional containing the user's name
    Optional<String> getUser(String name);

    // Default method that returns a welcome message
    default String getWelcomeMessage() {
        return "Welcome, Guest!";
    }
}

// Implementation of UserService
class UserServiceImpl implements UserService {
    @Override
    public Optional<String> getUser(String name) {
        // Use Optional.ofNullable() to handle null values safely
        return Optional.ofNullable(name).filter(n -> !n.isEmpty());
    }

    // Method to return the final welcome message
    public String getWelcomeMessage(String name) {
        return getUser(name)
                .map(n -> "Welcome, " + n + "!") // If name exists, return personalized message
                .orElse(getWelcomeMessage()); // If name is null/empty, return default message
    }
}

// Main class to test the implementation
public class OptionalUserExample {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        // Test cases
        System.out.println(userService.getWelcomeMessage("Alice")); // Output: Welcome, Alice!
        System.out.println(userService.getWelcomeMessage(null)); // Output: Welcome, Guest!
        System.out.println(userService.getWelcomeMessage("")); // Output: Welcome, Guest!
    }
}
