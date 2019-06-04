package org.lbl.springboot.demo.t5;

import org.beetl.sql.core.annotatoin.SqlStatement;
import org.beetl.sql.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountT5Dao extends BaseMapper<AccountT5> {

    @SqlStatement(params = "name")
    AccountT5 selectAccountByName(String name);
}
