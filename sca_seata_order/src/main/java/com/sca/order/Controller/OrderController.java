package com.sca.order.Controller;

import com.sca.order.Service.OrderService;
import com.sca.order.pojo.OrderTbl;
import com.sca.order.pojo.RequestResult;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 阳光大男孩！！！
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("order")
public class OrderController {

    private final OrderService orderService;
    @RequestMapping("/createOrder")
    public RequestResult createOrder(OrderTbl orderTbl)
    {
        System.out.println(orderTbl);
        orderService.create(orderTbl);
        return RequestResult.ok();
    }

}
