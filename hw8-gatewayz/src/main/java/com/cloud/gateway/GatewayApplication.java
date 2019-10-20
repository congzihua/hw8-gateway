package com.cloud.gateway;

import javax.servlet.MultipartConfigElement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * @ClassName:  GatewayApplication   
 * @Description:网关 启动入口
 * @author: lilaibin
 * @date:   2018年10月11日 下午1:07:59   
 * 断路器熔断
 */
@EnableZuulProxy
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableEurekaClient
public class GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}
	@Bean  
	public MultipartConfigElement multipartConfigElement() {  
	    MultipartConfigFactory factory = new MultipartConfigFactory();  
	    //单个文件最大  
	    factory.setMaxFileSize("100MB"); //KB,MB  
	    //设置总上传数据总大小  
	    factory.setMaxRequestSize("100MB");  
	    return factory.createMultipartConfig();  
	}
}