package com.api.ivarbank.repository;

import com.api.ivarbank.entity.Account;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends ListCrudRepository<Account, Long> {
}
