package dev.enrique.ecommerce.service;


import dev.enrique.ecommerce.entity.Customer;

import java.util.Optional;

public interface CustomerService {
    Customer createCustomer(Customer customer);
    Optional<Customer> getCustomer(int id);
    void updateCustomer(Customer customer);
    void deleteCustomer(int id);
}
