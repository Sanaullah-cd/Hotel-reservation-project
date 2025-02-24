package hotel;

public class Payment {
    private Customer customer;
    private double amount;

    public Payment(Customer customer, double amount) {
        this.customer = customer;
        this.amount = amount;
    }

    public void processPayment() {
        System.out.println("Payment of $" + amount + " received from " + customer);
    }
}
