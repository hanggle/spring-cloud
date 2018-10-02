package com.hanggle.eurekaclient;

import com.hanggle.config.RibbonConfig;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.stereotype.Component;

/**
 * description: <br/>
 * author: zh <br/>
 * date: 2018/10/2 <br/>
 */
@Component
@RibbonClient(name = "EUREKA-CLIENT-PROVIDER", configuration = RibbonConfig.class)
public class RabbonConfiguration {

}
