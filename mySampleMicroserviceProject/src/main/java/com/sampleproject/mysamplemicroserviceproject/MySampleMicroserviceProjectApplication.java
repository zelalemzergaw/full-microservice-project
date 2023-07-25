package com.sampleproject.mysamplemicroserviceproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MySampleMicroserviceProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(MySampleMicroserviceProjectApplication.class, args);
    }

}
