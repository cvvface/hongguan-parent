package com.hg.data;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.hg.data.mapper")
@SpringBootApplication
public class HongguanDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(HongguanDataApplication.class, args);
	}
}
