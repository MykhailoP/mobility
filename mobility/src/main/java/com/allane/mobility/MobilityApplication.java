package com.allane.mobility;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class MobilityApplication {

    public static void main(String[] args) {
        SpringApplication.run(MobilityApplication.class, args);
    }

}
