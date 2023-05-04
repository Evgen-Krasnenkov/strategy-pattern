package org.kras.customer;

public interface PaymentTool {
    String pay(int amount);
    PaymentTool bankPaymentTool = (int amount) -> "BankPaymentTool transferred USD: " + amount;
    PaymentTool payPalPaymentTool = (int amount) -> "PayPalPaymentTool transferred USD: " + amount;
}
