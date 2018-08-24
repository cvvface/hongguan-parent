package com.hg.servicebussiness;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.hg.servicebussiness.mapper")
public class HongguanServiceBussinessApplication {

	public static void main(String[] args) {
		SpringApplication.run(HongguanServiceBussinessApplication.class, args);
	}
}
