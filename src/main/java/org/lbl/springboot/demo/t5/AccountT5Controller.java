package org.lbl.springboot.demo.t5;

import org.beetl.sql.core.db.KeyHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/t5")
public class AccountT5Controller {

    @Autowired
    AccountT5Dao accountT5Dao;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<AccountT5> getAccounts() {
        return accountT5Dao.all();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public AccountT5 getAccountById(@PathVariable("id") int id) {
        return accountT5Dao.unique(id);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public AccountT5 getAccountById(@RequestParam("name") String name) {
        return accountT5Dao.selectAccountByName(name);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public String updateAccount(@PathVariable("id") int id, @RequestParam(value = "name", required = true) String name,
                                @RequestParam(value = "money", required = true) double money) {
        AccountT5 accountT5 = new AccountT5();
        accountT5.setMoney(money);
        accountT5.setName(name);
        accountT5.setId(id);
        int t = accountT5Dao.updateById(accountT5);
        if (t == 1) {
            return accountT5.toString();
        } else {
            return "fail";
        }
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String postAccount(@RequestParam(value = "name") String name,
                              @RequestParam(value = "money") double money) {
        AccountT5 accountT5 = new AccountT5();
        accountT5.setMoney(money);
        accountT5.setName(name);
        KeyHolder t = accountT5Dao.insertReturnKey(accountT5);
        if (t.getInt() > 0) {
            return accountT5.toString();
        } else {
            return "fail";
        }
    }
}