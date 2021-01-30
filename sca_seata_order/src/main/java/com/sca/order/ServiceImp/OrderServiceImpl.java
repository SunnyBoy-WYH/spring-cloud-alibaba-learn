package com.sca.order.ServiceImp;

import com.sca.order.Dao.OrderTblDao;
import com.sca.order.Service.AccountService;
import com.sca.order.Service.StorageService;
import com.sca.order.pojo.OrderTbl;
import com.sca.order.Service.OrderService;

import io.seata.spring.annotation.GlobalTransactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 阳光大男孩！！！
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class OrderServiceImpl implements OrderService {

    private final OrderTblDao orderTblDao;
    private final StorageService storageService;
    private final AccountService accountService;

    @Override
    @GlobalTransactional(name = "fsp-create-order",rollbackFor = Exception.class)
    public void create(OrderTbl orderTbl) {

        log.info("----->开始新建订单");
        //1 新建订单
        orderTblDao.insertSelective(orderTbl);

        //2 扣减库存
        log.info("----->订单微服务开始调用库存，做扣减Count");
        storageService.deduct(orderTbl.getCommodityCode(),orderTbl.getCount());
        log.info("----->订单微服务开始调用库存，做扣减end");

        //3 扣减账户
        log.info("----->订单微服务开始调用账户，做扣减Money");
        accountService.decreaseMoney(orderTbl.getUserId(),orderTbl.getMoney());
        log.info("----->订单微服务开始调用账户，做扣减end");

        log.info("----->下单全流程结束.........");
    }
}
