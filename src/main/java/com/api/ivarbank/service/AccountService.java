package com.api.ivarbank.service;

import com.api.ivarbank.entity.Account;
import com.api.ivarbank.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
public class AccountService {

    private final AccountRepository accountRepository;

    @Autowired
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Account getAccount(Long id) {
        return accountRepository.findById(id).orElse(null);
    }

    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }

    @Transactional
    public void updateBalance(Long accountId, Double amount) {
        Account account = accountRepository.findById(accountId)
                .orElseThrow(() -> new RuntimeException("Account not found"));
        account.setBalance(account.getBalance() + amount);

        accountRepository.save(account);
    }

}
