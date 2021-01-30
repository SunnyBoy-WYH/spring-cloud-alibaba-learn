package com.sca.order.Service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 阳光大男孩！！！
 */
@FeignClient(value = "seata-account-service",url = "http://localhost:9001")
public interface AccountService {

    /**
     * 减钱
     * @param userId
     * @param money
     */
    @RequestMapping("/account/decreaseMoney")
    void decreaseMoney(@RequestParam("userId") String userId, @RequestParam("money") Integer money);
}
