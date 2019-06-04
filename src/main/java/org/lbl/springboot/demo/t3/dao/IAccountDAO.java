package org.lbl.springboot.demo.t3.dao;

import org.lbl.springboot.demo.t3.domain.Account;

import java.util.List;

public interface IAccountDAO {
    int add(Account account);

    int update(Account account);

    int delete(int id);

    Account findAccountById(int id);

    List<Account> findAccountList();
}
