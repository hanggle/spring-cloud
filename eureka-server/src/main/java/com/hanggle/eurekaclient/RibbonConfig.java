package com.hanggle.eurekaclient;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

/**
 * description: <br/>
 * author: zh <br/>
 * date: 2018/10/2 <br/>
 */
@Configuration
@RibbonClient(name = "custom", configuration = RibbonConfig.class)
public class RibbonConfig {

}
