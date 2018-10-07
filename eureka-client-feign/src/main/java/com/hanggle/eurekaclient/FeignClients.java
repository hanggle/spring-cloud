package com.hanggle.eurekaclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * description: <br/>
 * author: zh <br/>
 * date: 2018/10/3 <br/>
 */
@FeignClient("eureka-client-provider")
public interface FeignClients {
    @GetMapping("/home")
    String feignTest();
}
