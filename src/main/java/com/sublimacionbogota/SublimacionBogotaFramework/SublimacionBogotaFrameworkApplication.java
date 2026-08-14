package com.sublimacionbogota.SublimacionBogotaFramework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.sublimacionbogota.framework")
@EnableJpaRepositories(basePackages = "com.sublimacionbogota.framework.dao")
@EntityScan(basePackages = "com.sublimacionbogota.framework.modelo")
public class SublimacionBogotaFrameworkApplication {

    public static void main(String[] args) {
        SpringApplication.run(SublimacionBogotaFrameworkApplication.class, args);
    }
}