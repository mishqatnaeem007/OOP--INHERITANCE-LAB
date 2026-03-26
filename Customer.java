class Customer extends User {
    private int cartSize;
    private  int loyaltyPoints;

    // Constructor chaining using super
    public Customer(int userId, String username, String password, int cartSize, int loyaltyPoints) {
        super(userId,username,  password);
        this.cartSize = cartSize;
        this.loyaltyPoints= loyaltyPoints;
    }

    public void placeOrder() {
        System.out.println("Order placed with "+ cartSize +" items.");
        System.out.println("Thamks for placing your order .");

    }

    // Overriding
    @Override
    public void displayInfo() {
        super.displayInfo(); // calling parent method
        System.out.println("Cart Size: " + cartSize);
        System.out.println("Loyalty Points: " + loyaltyPoints);
    }

    // Calculation method
    public double calculateDiscount() {
        return loyaltyPoints * 0.1;
    }

    @Override
    public String toString() {
        return "Customer[Cart=" + cartSize + ", Points=" + loyaltyPoints + "]";
    }}
