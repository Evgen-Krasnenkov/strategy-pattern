package org.kras.customer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CustomerTest {
    @Test
    void givenCustomerStrategy_whenChooseStrategy_thenCorrectOneWorks() {
        Customer customer = new Customer();
        customer.makePayment(100, PaymentTool.bankPaymentTool);
        Assertions.assertEquals("BankPaymentTool transferred USD: 100",
                customer.getMessage());
        customer.makePayment(200,PaymentTool.payPalPaymentTool);
        Assertions.assertEquals("PayPalPaymentTool transferred USD: 200",
                customer.getMessage());

    }

}