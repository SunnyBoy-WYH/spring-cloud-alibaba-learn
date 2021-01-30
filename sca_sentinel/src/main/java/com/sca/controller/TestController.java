package com.sca.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
public class TestController {

    /**
     *   @SentinelResource批注用于标识资源是否受速率限制或降级。在上面的示例中，注释的“ hello”属性引用资源名称。
     */
    @GetMapping(value = "/helloA")
    @SentinelResource("helloA")
    public String helloA() {
        return "Hello Sentinel A";
    }
    @GetMapping(value = "/helloB")
    @SentinelResource("helloB")
    public String helloB() {
        return "Hello Sentinel B";
    }
    @GetMapping(value = "/helloC")
    @SentinelResource("helloC")
    public String helloC() {
        try{
            TimeUnit.MILLISECONDS.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Hello Sentinel A";
    }
    @GetMapping(value = "/testHotKey")
    @SentinelResource(value = "testHotKey",blockHandler = "deal_hot_key")
    public String testHotKey(@RequestParam(value = "p1",required = false) String p1,
                             @RequestParam(value = "p2",required = false) String p2) {

        return "Hello Sentinel HotKey";
    }
    public String deal_hot_key(String p1, String p2, BlockException exception)
    {

        return "deal_hot_key";
    }

}
