package org.lbl.springboot.demo.t4.controller;

import org.lbl.springboot.demo.t4.domain.AccountT4;
import org.lbl.springboot.demo.t4.service.IAccountServiceT4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/t4")
public class AccountControllerT4 {
    @Autowired
    private IAccountServiceT4 accountService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<AccountT4> getAccounts() {
        System.out.println(accountService.findAll());
        return accountService.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public AccountT4 getAccountById(@PathVariable("id") int id) {
        return accountService.findById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public String updateAccount(@PathVariable("id") int id, @RequestParam(value = "name", required = true) String name,
                                @RequestParam(value = "money", required = true) double money) {
        AccountT4 account = new AccountT4();
        account.setMoney(money);
        account.setName(name);
        account.setId(id);
        AccountT4 account1 = accountService.saveAndFlush(account);

        return account1.toString();

    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String postAccount(@RequestParam(value = "name") String name,
                              @RequestParam(value = "money") double money) {
        AccountT4 account = new AccountT4();
        account.setMoney(money);
        account.setName(name);
        AccountT4 account1 = accountService.save(account);
        return account1.toString();

    }
}
