package de.addesi.mhock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AdessiApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdessiApplication.class, args);
    }

}
