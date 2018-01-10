/*
 * Copyright (C) 2017 北京好药师大药房连锁有限公司(www.ehaoyao.com) , All Rights Reserved.
 */
package com.ehaoyao.apigateway.config;

import com.ehaoyao.apigateway.filter.AccessFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @Description API网关配置类
 * @Author cuiyaosheng
 * @Date 2017-12-23 11:03
 * @Modified by:
 **/
@Configuration
public class ApiGatewayConfig {
    /**
     * 请求访问过滤器 校验和权限
     * @return
     */
    @Bean
    public AccessFilter accessFilter() {
        return new AccessFilter();
    }

    @Bean(name="zuul.CONFIGURATION_PROPERTIES")
    @RefreshScope
    @ConfigurationProperties("zuul")
    @Primary
    public ZuulProperties zuulProperties() {
        return new ZuulProperties();
    }
}
