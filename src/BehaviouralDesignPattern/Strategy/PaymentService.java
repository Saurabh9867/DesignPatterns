package BehaviouralDesignPattern.Strategy;

public interface PaymentService {

    void validatePaymentDetails();
    void processPayment(int amount);

}
