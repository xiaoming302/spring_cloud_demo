package com.cloud.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author luoming
 * @version V1.0
 * @description
 * @creater 2018/6/24 下午9:50
 * @modified
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AppServerUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppServerUserApplication.class, args);
    }

}
