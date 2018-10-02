package com.hanggle.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * description: <br/>
 * author: zh <br/>
 * date: 2018/10/2 <br/>
 */
@Configuration
public class RibbonConfig {
    @Bean
    public IRule ribbonRule(){
        return new RandomRule();
    }
}
