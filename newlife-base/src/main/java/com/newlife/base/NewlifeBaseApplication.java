package com.newlife.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author jize
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NewlifeBaseApplication {
    public static void main(String[] args) {
        SpringApplication.run(NewlifeBaseApplication.class, args);
    }

}
