package BehaviouralDesignPattern.Strategy;

public class Checkout {

    private PaymentService paymentService;

    public void setPaymentService(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    public void doTransaction(int amount){
        paymentService.validatePaymentDetails();
        paymentService.processPayment(amount);
    }

}
