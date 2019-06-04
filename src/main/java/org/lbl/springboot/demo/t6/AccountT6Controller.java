package org.lbl.springboot.demo.t6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/t6")
public class AccountT6Controller {
    @Autowired
    AccountT6Service accountService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<AccountT6> getAccounts() {
        return accountService.findAccountList();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public AccountT6 getAccountById(@PathVariable("id") int id) {
        return accountService.findAccount(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public String updateAccount(@PathVariable("id") int id, @RequestParam(value = "name", required = true) String name,
                                @RequestParam(value = "money", required = true) double money) {
        int t = accountService.update(name, money, id);
        if (t == 1) {
            return "success";
        } else {
            return "fail";
        }
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable(value = "id") int id) {
        int t = accountService.delete(id);
        if (t == 1) {
            return "success";
        } else {
            return "fail";
        }

    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String postAccount(@RequestParam(value = "name") String name,
                              @RequestParam(value = "money") double money) {
        int t = accountService.add(name, money);
        if (t == 1) {
            return "success";
        } else {
            return "fail";
        }

    }
}
