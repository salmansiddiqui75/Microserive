package com.siddiqui.accounts.mapper;

import com.siddiqui.accounts.dto.AccountsDto;
import com.siddiqui.accounts.entity.Accounts;

public class AccountMapper
{
    public static AccountsDto mapToAccountsDto(Accounts account, AccountsDto accountsDto) {
        accountsDto.setAccountNumber(account.getAccountNumber());
        accountsDto.setAccountType(account.getAccountType());
        accountsDto.setBranchAddress(account.getBranchAddress());
        return accountsDto;
    }

    public static Accounts mapToAccounts(AccountsDto accountsDto, Accounts accounts) {
        accounts.setAccountNumber(accountsDto.getAccountNumber());
        accounts.setAccountType(accountsDto.getAccountType());
        accounts.setBranchAddress(accountsDto.getBranchAddress());
        return accounts;
    }
}
