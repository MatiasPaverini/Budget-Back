package com.mpaverini.budget.payments.owners;

import java.util.List;
import lombok.Data;

@Data
public class SharedPayment {

  private boolean shared;
  private List<String> owners;
}
