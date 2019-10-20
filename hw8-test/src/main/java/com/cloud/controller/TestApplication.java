package com.cloud.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * 
 * @Description:springboot启动类
 * @ClassName: AgroMetApplication  
 * @author admin 
 * @date 2019年4月18日 下午8:28:57
 */
@EnableAsync
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

}
