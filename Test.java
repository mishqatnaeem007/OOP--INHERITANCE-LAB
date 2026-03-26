public class Test {
    public static void main(String[] args) {
        // User object
        User u = new User(1, "mishkat", "1234");
        u.login();
        u.displayInfo();
        System.out.println();
        // Customer object
        Customer c = new Customer(2, "ali", "abcd", 3, 50);
        c.login();
        c.placeOrder();
        c.displayInfo();
        System.out.println("Discount: " + c.calculateDiscount());
        System.out.println();

        // PremiumCustomer object
        PremiumCustomer p = new PremiumCustomer(3, "zara", "xyz", 5, 100, "Gold", 0.2);
        p.login();
        p.placeOrder();
        p.upgradeMembership();
        p.displayInfo();
        System.out.println("Discount: " + p.calculateDiscount());
    }
}
