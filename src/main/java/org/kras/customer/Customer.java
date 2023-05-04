package org.kras.customer;

public class Customer {
  private String message;

  public String getMessage() {
    return message;
  }

  public void makePayment(int amount, PaymentTool paymentTool) {
    this.message = paymentTool.pay(amount);
  }

}
