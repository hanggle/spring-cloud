package com.hanggle.eurekaclient;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description: <br/>
 * author: zh <br/>
 * date: 2018/9/9 <br/>
 */
@Slf4j
@RestController
public class TestController {

    @RequestMapping("/home")
    public String home() {
        log.info("this is  server 2");
        return "this is server 2";
    }

}
