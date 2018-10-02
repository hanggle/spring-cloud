package com.hanggle.eurekaclient;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description: <br/>
 * author: zh <br/>
 * date: 2018/9/9 <br/>
 */
@RestController
public class TestController {

    @RequestMapping("/home")
    public String home() {
        return "this is client2";
    }

}
