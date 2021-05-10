package com.pactera;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Michael
 * @date 2021/4/27
 * @decription
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.pactera.mapper"})
public class MyBootApplication {
	public static void main(String[] args) {
		SpringApplication.run(MyBootApplication.class,args);
	}
}
