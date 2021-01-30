package com.sca.order.Service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "seata-storage-service",url = "http://localhost:9003")
public interface StorageService {

    /**
     * 扣除存储数量
     */
    @RequestMapping("/storage/deduct")
    void deduct(@RequestParam("commodityCode") String commodityCode, @RequestParam("count") int count);
}
