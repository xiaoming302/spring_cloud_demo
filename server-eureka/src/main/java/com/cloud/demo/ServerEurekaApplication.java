package com.cloud.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author luoming
 * @version V1.0
 * @description
 * @creater 2018/6/24 下午8:12
 * @modified
 */
@SpringBootApplication
@EnableEurekaServer
public class ServerEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServerEurekaApplication.class, args);
    }
}
