package com.example.bookmybusgatewayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BookMyBusGatewayServerApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .profiles("dev")
                .sources(BookMyBusGatewayServerApplication.class)
                .run(args);
    }

}
