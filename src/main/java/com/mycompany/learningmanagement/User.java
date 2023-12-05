
class User {
    private String firstName;
    private String lastName;
    private int id;
    private String password;
    private double GPA;

    public User() {}

    public User(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    // Setters and getters for all attributes
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public String generatePassword(String firstName, String lastName, int id) {
        // Implementation to generate password
        return ""; // Return generated password
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword(int id, String password) {
        // Check if the password matches the user's password
        return (this.id == id && this.password.equals(password)) ? "Correct password" : "Incorrect password";
    }
}
