package org.lbl.springboot.demo.t4.dao;

import org.lbl.springboot.demo.t4.domain.AccountT4;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository     //Interger是主键的类型，一般为Integer或者Long
public interface AccountDaoT4 extends JpaRepository<AccountT4, Integer> {
}
