package com.mpaverini.budget.expenses;

import com.mpaverini.budget.payments.owners.SharedPayment;
import java.util.Date;
import java.util.List;
import lombok.Data;

@Data
public class Expenses {

  private Date expenseDate;
  private String description;
  private Double amount;
  private String expenseType;
  private boolean creditCard;
  private String paymentType;
  private String creditCardInfo;
  private SharedPayment sharedPayment;

}
