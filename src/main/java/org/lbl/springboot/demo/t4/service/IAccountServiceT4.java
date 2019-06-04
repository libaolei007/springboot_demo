package org.lbl.springboot.demo.t4.service;

import org.lbl.springboot.demo.t4.domain.AccountT4;

import java.util.List;

public interface IAccountServiceT4 {

    AccountT4 save(AccountT4 account);

    AccountT4 saveAndFlush(AccountT4 account);

    void delete(int id);

    AccountT4 findById(int id);

    List<AccountT4> findAll();
}
