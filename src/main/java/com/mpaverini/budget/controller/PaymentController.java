package com.mpaverini.budget.controller;


import com.mpaverini.budget.service.ExpensesService;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PaymentController {

  private final String BASE_URI = "/payments";

  @Autowired
  ExpensesService expensesService;

  @GetMapping("/")
  public Response getPayment() {
    return null;
  }

  @PostMapping("/")
  public String AddPayment(@RequestBody Object payment) {
    return "";
  }

}
