/*
 * Copyright (C) 2017 北京好药师大药房连锁有限公司(www.ehaoyao.com) , All Rights Reserved.
 */
package com.ehaoyao.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;
import zipkin.server.EnableZipkinServer;
/**
 * @Description 服务跟踪中心
 * @author
 * @Date 2017-12-23 11:03
 * @Modified by:
 **/
@EnableZipkinStreamServer
@SpringBootApplication
public class MicroserviceZipkinServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceZipkinServerApplication.class, args);
	}
}
