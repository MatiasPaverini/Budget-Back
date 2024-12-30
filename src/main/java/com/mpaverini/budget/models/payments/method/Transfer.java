package com.mpaverini.budget.models.payments.method;

import com.mpaverini.budget.enums.PaymentMethodType;

public class Transfer extends PaymentMethod {

  public Transfer() {
    this.name = PaymentMethodType.TRANSFER.name();
  }
}
