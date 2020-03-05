package com.javaboy.securitydy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan(basePackages = "com.javaboy.sercuritydy.mapper")

public class SpringbootSecuritydyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSecuritydyApplication.class, args);
	}

}
