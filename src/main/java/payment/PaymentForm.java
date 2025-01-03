package payment;

public class PaymentForm {
    public static void main(String[] args) {
        PaymentForm form = new PaymentForm();
        form.submitPayment("4111111111111111", 100.50);
        form.submitPayment("5111111111111111", 50.00);
    }

    public void submitPayment(String cardNumber, double amount) {
        if (cardNumber != null && cardNumber.startsWith("4") && amount > 0) {
            System.out.println("Payment of $" + amount + " succeeded for card: " + cardNumber);
        } else {
            System.out.println("Payment failed. Check card number or amount.");
        }
    }
}
