package com.cx.adspringcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @description:
 * @author: ChenXi
 * @time: 2021/1/19 14:56
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain8001.class,args);
    }
}
