package com.example;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.mapper")
public class GasSpringBootApplication {
	public static void main(String[] args) {
		SpringApplication.run(GasSpringBootApplication.class, args);
	}
}
