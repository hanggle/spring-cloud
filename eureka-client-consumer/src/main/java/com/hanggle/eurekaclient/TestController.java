package com.hanggle.eurekaclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * description: <br/>
 * author: zh <br/>
 * date: 2018/9/9 <br/>
 */
@RestController
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/ribbon")
    public String ribbon() {
        return restTemplate.getForEntity("http://EUREKA-CLIENT-PROVIDER/home", String.class).getBody();
    }

}
