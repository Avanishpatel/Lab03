package com.solstice.ecommerce.repository;

import com.solstice.ecommerce.model.Address;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public class AddressRepository implements CrudRepository<Address, Long> {
    @Override
    public <S extends Address> S save(S s) {
        return null;
    }

    @Override
    public <S extends Address> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Address> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Address> findAll() {
        return null;
    }

    @Override
    public Iterable<Address> findAllById(Iterable<Long> iterable) {
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
    public void delete(Address address) {

    }

    @Override
    public void deleteAll(Iterable<? extends Address> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
