package org.springframework.cloud.netflix.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: Wjt
 * @Date: 2019/8/9 20:17
 * @ProjectName: spring-cloud-netflix-eureka-server
 * @Description: 入口函数
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}

}
