package com.sca.storage.Controller;

import com.sca.storage.Service.StorageService;
import com.sca.storage.pojo.RequestResult;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/storage")
@RequiredArgsConstructor
public class StorageController {
    private final StorageService storageService;

    @RequestMapping("/deduct")
    public RequestResult deduct(@RequestParam("commodityCode") String commodityCode,
                                @RequestParam("count") Integer count)
    {
        storageService.deduct(commodityCode,count);
        return RequestResult.ok();
    }
}
