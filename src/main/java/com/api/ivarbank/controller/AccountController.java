package com.api.ivarbank.controller;

import com.api.ivarbank.entity.Account;
import com.api.ivarbank.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/account")
public class AccountController {

    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/{id}")
    public Account getAccount(@PathVariable Long id) {
        return accountService.getAccount(id);
    }

    @PostMapping
    public Account createAccount(@RequestBody Account account) {
        return accountService.createAccount(account);
    }

    @PostMapping("/update")
    public void makeTransaction(@RequestParam Long id, @RequestParam Double amount) {
        accountService.updateBalance(id, amount);
    }
}
