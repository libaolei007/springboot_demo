package org.lbl.springboot.demo.t6;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AccountT6Mapper {

    @Insert("insert into account(name, money) values(#{name}, #{money})")
    int add(@Param("name") String name, @Param("money") double money);

    @Update("update account set name = #{name}, money = #{money} where id = #{id}")
    int update(@Param("name") String name, @Param("money") double money, @Param("id") int  id);

    @Delete("delete from account where id = #{id}")
    int delete(int id);

    @Select("select id, name as name, money as money from account where id = #{id}")
    AccountT6 findAccount(@Param("id") int id);

    @Select("select id, name as name, money as money from account")
    List<AccountT6> findAccountList();
}
