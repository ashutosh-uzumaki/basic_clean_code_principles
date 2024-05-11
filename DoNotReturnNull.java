public class DoNotReturnNull {

    // Method to find a user by username
    public static User findUserByUsername(String username) {

        // Returning null could cause NullPointerException on client side.
//        return null;
        //Return a optional object or throw an exception and use try catch.

        throw new RuntimeException("User not found");
    }

    // Main method to demonstrate the usage of findUserByUsername
    public static void main(String[] args) {
        String username = "john_doe";
        try {
            User user = findUserByUsername(username);
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }


    }
}

class User {
    private String username;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}
