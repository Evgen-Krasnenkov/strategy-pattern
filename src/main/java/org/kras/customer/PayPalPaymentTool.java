package org.kras.customer;

public class PayPalPaymentTool implements PaymentTool {
    @Override
    public String pay(int amount) {
        return this.getClass().getSimpleName() + " transferred USD: " + amount;
    }
}
