package com.siddiqui.accounts.repository;

import com.siddiqui.accounts.entity.Accounts;
import com.siddiqui.accounts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Accounts,Long>
{
}
