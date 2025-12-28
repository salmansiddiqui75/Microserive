package com.siddiqui.accounts.service.impl;

import com.siddiqui.accounts.dto.CustomerDto;
import com.siddiqui.accounts.entity.Customer;
import com.siddiqui.accounts.mapper.CustomerMapper;
import com.siddiqui.accounts.repository.AccountRepository;
import com.siddiqui.accounts.repository.CustomerRepository;
import com.siddiqui.accounts.service.IAccountsService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountServiceImpl implements IAccountsService
{
    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void createAccount(CustomerDto customerDto)
    {
        Customer customer=CustomerMapper.mapToCustomer(customerDto,new Customer());
        customerRepository.save(customer);
    }
}
