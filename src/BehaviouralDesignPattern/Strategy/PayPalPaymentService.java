package BehaviouralDesignPattern.Strategy;

public class PayPalPaymentService implements PaymentService{

    @Override
    public void validatePaymentDetails() {
        // add logic to validate PayPal payment service
    }

    @Override
    public void processPayment(int amount) {
        // add logic to process payment using PayPal payment service
    }
}
