package org.lbl.springboot.demo.t6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountT6Service {
    @Autowired
    private AccountT6Mapper accountT6Mapper;
    public int add(String name, double money) {
        return accountT6Mapper.add(name, money);
    }
    public int update(String name, double money, int id) {
        return accountT6Mapper.update(name, money, id);
    }
    public int delete(int id) {
        return accountT6Mapper.delete(id);
    }
    public AccountT6 findAccount(int id) {
        return accountT6Mapper.findAccount(id);
    }
    public List<AccountT6> findAccountList() {
        return accountT6Mapper.findAccountList();
    }
}
