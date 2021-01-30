package com.sca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author 阳光大男孩！！！
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NacosConfigApplication {

    public static void main(String[] args) {
       SpringApplication.run(NacosConfigApplication.class, args);

    }
}
