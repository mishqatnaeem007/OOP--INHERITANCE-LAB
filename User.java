class User {
    private int userId;
     private String username;
    private String password;

    // Constructor
    public User(int userId, String username, String password) {
        this.userId = userId;
        this.username = username;
        this.password = password;
    }
    // Method
    public void login() {
        System.out.println(username + " logged in successfully.");
    }
    public void displayInfo() {
        System.out.println("User ID: " + userId);
        System.out.println("Username: " + username);
    }

      public String toString() {
        return "User[ID=" + userId + ", Username=" + username + "]";
    }
}
