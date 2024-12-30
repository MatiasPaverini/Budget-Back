package com.mpaverini.budget.models.payments.method;

import com.mpaverini.budget.enums.PaymentMethodType;

public class Cash extends PaymentMethod {

  public Cash() {
    this.name = PaymentMethodType.CASH.name();
  }
}
