package com.api.ivarbank.repository;

import com.api.ivarbank.entity.Transaction;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends ListCrudRepository<Transaction, Long> {
}
