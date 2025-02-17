package model.services;

public interface OnlinePaymentService {
    default double paymentFee(double amount) {
        return 0.02 * amount;
    }

    default double interest(double amount, int months) {
        return months * amount / 100;
    }
}