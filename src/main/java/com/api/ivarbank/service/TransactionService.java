package com.api.ivarbank.service;

import com.api.ivarbank.entity.Transaction;
import com.api.ivarbank.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    private final TransactionRepository transactionRepository;

    @Autowired
    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public List<Transaction> findAll() {
        return transactionRepository.findAll();
    }

    public Transaction makeTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }


}
