package com.internet.banking.account.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.internet.banking.account.model.Account;

public interface AccountRepository extends Repository<Account, Integer> {

  Account save(Account account);

  List<Account> findAll();
}
