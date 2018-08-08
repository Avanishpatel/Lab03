package com.solstice.ecommerce.repository;

import com.solstice.ecommerce.model.Account;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public class AccountRepository implements CrudRepository<Account, Long> {


    @Override
    public <S extends Account> S save(S s) {
        return null;
    }

    @Override
    public <S extends Account> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Account> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Account> findAll() {
        return null;
    }

    @Override
    public Iterable<Account> findAllById(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Account account) {

    }

    @Override
    public void deleteAll(Iterable<? extends Account> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
