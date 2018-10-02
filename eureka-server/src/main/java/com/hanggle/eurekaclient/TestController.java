package com.hanggle.eurekaclient;

import org.springframework.web.bind.annotation.*;

/**
 * description: <br/>
 * author: zh <br/>
 * date: 2018/9/9 <br/>
 */
@RestController
public class TestController {

    @RequestMapping("/home")
    public String home() {
        return "this is client1";
    }

}
