package com.allane.mobility.utils;

import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Lazy(false)
public class FlywayApiConfig {

    @Value("${spring.datasource.url}")
    private String mariaDbUrl;

    @Value("${spring.datasource.username}")
    private String username;

    @Value("${spring.datasource.password}")
    private String password;

    @PostConstruct
    public void init() {
       Flyway.configure()
                .dataSource(mariaDbUrl, username, password)
                .load()
                .migrate();
    }

}
