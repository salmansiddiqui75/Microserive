package com.siddiqui.accounts.service;

import com.siddiqui.accounts.dto.CustomerDto;

public interface IAccountsService
{
    public void createAccount(CustomerDto customerDto);
    public CustomerDto fetchAccount(String mobileNumber);
    boolean updateAccount(CustomerDto customerDto);
    boolean deleteAccount(String mobileNumber);
}
