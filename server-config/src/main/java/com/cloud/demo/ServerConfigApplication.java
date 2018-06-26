package com.cloud.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author luoming
 * @version V1.0
 * @description
 * @creater 2018/6/24 下午8:35
 * @modified
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigServer
public class ServerConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerConfigApplication.class, args);
    }

}
