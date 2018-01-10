/*
 * Copyright (C) 2017 北京好药师大药房连锁有限公司(www.ehaoyao.com) , All Rights Reserved.
 */
package com.ehaoyao.apigateway;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Description API网关中心
 * @Author cuiyaosheng
 * @Date 2017-12-23 11:03
 * @Modified by:
 **/
@EnableZuulProxy
@EnableApolloConfig
@SpringBootApplication
public class MicroserviceApigatewayServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceApigatewayServerApplication.class, args);
	}
}
