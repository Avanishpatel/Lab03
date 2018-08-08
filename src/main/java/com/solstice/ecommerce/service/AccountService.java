package com.solstice.ecommerce.service;

import com.solstice.ecommerce.model.Account;
import com.solstice.ecommerce.repository.AccountRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

@Service
public class AccountService {

    private AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public void addAccount(Account account) {

        accountRepository.save(account);
    }

    public Optional<Account> getAccountById(long id) {

        return accountRepository.findById(id);
    }

    public void updateAccount(Long id, Account account) {

        accountRepository.save(account);
    }

    public void deleteAccountById(long id) {

        accountRepository.deleteById(id);
    }

    public List<Account> getAllAccount() {

        return accountRepository.findAll();
    }
}
