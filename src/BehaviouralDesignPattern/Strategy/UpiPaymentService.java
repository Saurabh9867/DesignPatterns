package BehaviouralDesignPattern.Strategy;

public class UpiPaymentService implements PaymentService{

    @Override
    public void validatePaymentDetails() {
        // add logic to validate UPI payment service
    }

    @Override
    public void processPayment(int amount) {
        // add logic to process payment using UPI payment service
    }
}
