package com.sca.order.Dao;

import com.sca.order.pojo.OrderTbl;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface OrderTblDao {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderTbl record);

    int insertSelective(OrderTbl record);

    OrderTbl selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderTbl record);

    int updateByPrimaryKey(OrderTbl record);
}
