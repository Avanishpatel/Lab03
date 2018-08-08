package com.solstice.ecommerce.controller;


import com.solstice.ecommerce.model.Account;
import com.solstice.ecommerce.service.AccountService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/account")
public class AccountController {


    private AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/getAll")
    public List<Account> getAllAccount() {

        return accountService.getAllAccount();
    }

    @PostMapping("/add")
    public String addAccount(@RequestBody Account account) {

        accountService.addAccount(account);
        return "Account is created.";
    }

    @GetMapping("/get/{id}")
    public Optional<Account> getAccount(@PathVariable("id") long id) {

        return accountService.getAccountById(id);
    }

    @PutMapping("/update/{id}")
    public String updateAccount(@PathVariable("id") Long id, @RequestBody Account account) {

        accountService.updateAccount(id, account);
        return "Account is updated.";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteAccountById(@PathVariable("id") long id) {

        accountService.deleteAccountById(id);

        return "Account with Account Number " + id + " successfully deleted.";
    }



}
