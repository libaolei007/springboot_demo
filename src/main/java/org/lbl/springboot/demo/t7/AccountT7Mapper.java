package org.lbl.springboot.demo.t7;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface AccountT7Mapper {
    int update(@Param("money") double money, @Param("id") int  id);
}
