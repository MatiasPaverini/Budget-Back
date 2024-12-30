package com.mpaverini.budget.models.payments.owners;

import java.util.List;
import lombok.Data;

@Data
public class SharedPayment {

  private boolean shared;
  private List<String> owners;
}
