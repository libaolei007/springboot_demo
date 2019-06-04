package org.lbl.springboot.demo.t7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountT7Service {
    @Autowired
    AccountT7Mapper accountT7Mapper;

    @Transactional
    public void transfer() throws RuntimeException{
        accountT7Mapper.update(90,1);//用户1减10块 用户2加10块
        int i=1/0;
        accountT7Mapper.update(110,2);
    }
}
