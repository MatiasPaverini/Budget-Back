package com.mpaverini.budget.models.payments.method;

import com.mpaverini.budget.enums.PaymentMethodType;

public class DebitCard extends Card {

  public DebitCard(long number, String bank) {
    this.bank = bank;
    this.number = number;
    this.credit = false;
    this.name = PaymentMethodType.CARD.name();
  }
}
