package com.api.ivarbank.controller;

import com.api.ivarbank.entity.Transaction;
import com.api.ivarbank.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/transaction")
public class TransactionController {

    private final TransactionService transactionService;

    @Autowired
    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping
    public Transaction createTransaction(@RequestBody Transaction transaction) {
        return transactionService.makeTransaction(transaction);
    }

    @GetMapping
    public List<Transaction> getAllTransactions() {
        return transactionService.findAll();
    }


}
