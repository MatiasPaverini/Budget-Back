package com.mpaverini.budget.models.payments;

import com.mpaverini.budget.enums.PaymentType;
import com.mpaverini.budget.models.payments.method.PaymentMethod;
import com.mpaverini.budget.models.payments.owners.SharedPayment;

import java.util.Date;

import lombok.Data;

@Data
public class Payment {

  private Date paymentDate;
  private String description;
  private Double amount;
  private boolean creditCard;
  private PaymentType paymentType;
  private PaymentMethod paymentMethod;
  private SharedPayment sharedPayment;

}
