package cn.snowBoard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SnowGateWayApplication {
    public static void main(String[] args) {
        SpringApplication.run(SnowGateWayApplication.class,args);
    }
}
