package com.sca.order.Service;

import com.sca.order.pojo.OrderTbl;

/**
 * @author 阳光大男孩！！！
 */
public interface OrderService {

    /**
     * 创建订单
     * @param orderTbl
     */
    void create(OrderTbl orderTbl);
}
