package BehaviouralDesignPattern.Strategy;

public class mainMethod {
    public static void main(String[] args) {

        PaymentService upiPaymentService = new UpiPaymentService();
        Checkout checkout = new Checkout();
        checkout.setPaymentService(upiPaymentService);
        checkout.doTransaction(2341);

    }
}
