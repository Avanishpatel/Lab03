package com.solstice.ecommerce.controller;


import com.solstice.ecommerce.model.Account;
import com.solstice.ecommerce.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/account")
public class AccountController {
//
//    @Autowired
//    private AccountService accountService;


    @PostMapping("/add")
    public String addAccount(@RequestBody Account account) {

//        accountService.addAccount(account);
        return "Account is created.";
    }

}
