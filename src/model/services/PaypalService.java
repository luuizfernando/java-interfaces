package model.services;

public class PaypalService implements OnlinePaymentService {
    public double paymentFee(double amount) {
        return 0.02 * amount;
    }

    public double interest(double amount, int months) {
        return amount * months / 100;
    }
}