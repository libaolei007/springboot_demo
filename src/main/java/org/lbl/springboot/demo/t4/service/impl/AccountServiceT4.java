package org.lbl.springboot.demo.t4.service.impl;

import org.lbl.springboot.demo.t4.dao.AccountDaoT4;
import org.lbl.springboot.demo.t4.domain.AccountT4;
import org.lbl.springboot.demo.t4.service.IAccountServiceT4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceT4 implements IAccountServiceT4 {
    @Autowired
    AccountDaoT4 accountDao;

    @Override
    public AccountT4 save(AccountT4 account) {
        return accountDao.save(account);
    }

    @Override
    public AccountT4 saveAndFlush(AccountT4 account) {
        return accountDao.saveAndFlush(account);
    }

    @Override
    public void delete(int id) {
      accountDao.deleteById(id);
    }

    @Override
    public AccountT4 findById(int id) {
        return accountDao.findById(id).get();
    }

    @Override
    public List<AccountT4> findAll() {
        return accountDao.findAll();
    }
}
