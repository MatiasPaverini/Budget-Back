package com.mpaverini.budget.models.payments.method;

public abstract class Card extends PaymentMethod {

  long number;
  boolean credit;
  String bank;
}
