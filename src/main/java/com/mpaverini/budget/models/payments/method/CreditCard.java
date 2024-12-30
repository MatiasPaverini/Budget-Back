package com.mpaverini.budget.models.payments.method;

import com.mpaverini.budget.enums.PaymentMethodType;

public class CreditCard extends Card {

  public CreditCard(long number, String bank) {
    this.bank = bank;
    this.number = number;
    this.credit = true;
    this.name = PaymentMethodType.CARD.name();
  }

}
