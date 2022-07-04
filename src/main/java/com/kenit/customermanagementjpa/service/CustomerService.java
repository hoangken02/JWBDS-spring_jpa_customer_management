package com.kenit.customermanagementjpa.service;

import com.kenit.customermanagementjpa.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();

    Customer findById(Long id);

    void save(Customer customer);

    void remove(Long id);
}
