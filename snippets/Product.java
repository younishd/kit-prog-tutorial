public class Product {

    private double price;
    private int quantity;
    private String identifier;
    private boolean primeEligible;

    public void display() {
        System.out.println("Price: " + this.price);
        System.out.println("Quantity: " + this.quantity);
        System.out.println("Identifier: " + this.identifier);
        System.out.println("Prime eligible: " + this.primeEligible);
    }

}
