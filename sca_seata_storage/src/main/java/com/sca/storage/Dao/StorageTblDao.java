package com.sca.storage.Dao;

import com.sca.storage.pojo.StorageTbl;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StorageTblDao {

    int updateByCommodityCode(@Param("commodityCode") String commodityCode, @Param("count") Integer count);
}
