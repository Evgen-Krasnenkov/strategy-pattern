package org.kras.paystrategy;

public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}