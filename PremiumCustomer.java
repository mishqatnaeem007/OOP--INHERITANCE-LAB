class PremiumCustomer extends Customer {
    private String membershipLevel;
    private double discountRate;

    public PremiumCustomer(int userId, String username, String password,
                           int cartSize, int loyaltyPoints,
                           String membershipLevel, double discountRate) {

        super(userId, username, password, cartSize, loyaltyPoints);
        this.membershipLevel = membershipLevel;
        this.discountRate = discountRate;
    }

    public void upgradeMembership() {
        System.out.println("Membership upgraded to " + membershipLevel);
    }

    // Overriding
    @Override
    public  void displayInfo() {
          super.displayInfo();
         System.out.println("Membership Level: " + membershipLevel);
         System.out.println("Discount Rate: " + discountRate);
    }

    // Calculation method
    @Override
    public double calculateDiscount() {
        return  super.calculateDiscount() + (discountRate * 100);
    }

    @Override
    public String toString() {
        return   "PremiumCustomer[Level=" + membershipLevel + ", Discount=" + discountRate + "]";}
}
