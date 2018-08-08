package com.solstice.ecommerce.service;

import com.solstice.ecommerce.model.Account;
import com.solstice.ecommerce.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public void addAccount(Account account) {

//        accountRepository.save(account);
    }
}
