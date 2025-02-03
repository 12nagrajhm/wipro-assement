
abstract class PaymentMethod {
    protected double amount;

    public PaymentMethod(double amount) {
        this.amount = amount;
    }

    public abstract void processPayment();
}

class CreditCard extends PaymentMethod {
    private double transactionFee = 2.5;

    public CreditCard(double amount) {
        super(amount);
    }

    @Override
    public void processPayment() {
        double finalAmount = amount + transactionFee; // Adding transaction fee
        System.out.println("Processing Credit Card payment of $" + finalAmount + " (including $2.5 fee).");
    }
}

class PayPal extends PaymentMethod {

    public PayPal(double amount) {
        super(amount);
    }

    @Override
    public void processPayment() {
        System.out.println("Processing PayPal payment of $" + amount + " (No extra fee).");
    }
}

public class OnlinePaymentSystem {

    public static void processTransaction(PaymentMethod paymentMethod) {
        paymentMethod.processPayment();
    }

    public static void main(String[] args) {
        PaymentMethod creditCardPayment = new CreditCard(100.0);
        PaymentMethod payPalPayment = new PayPal(50.0);
        System.out.println("Transaction 1:");
        processTransaction(creditCardPayment);

        System.out.println("\nTransaction 2:");
        processTransaction(payPalPayment);
    }
}
