package com.sca.account.Dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface AccountTblDao {

    void decrease(@Param("userId") String userId, @Param("money")Integer money);
}
