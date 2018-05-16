package com.beifeng.hadoop.spring.cloud.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableTurbine //开启turbine,该注解包含了@EnableDiscoveryClient
public class TurbineApp {
    public static void main(String[] args) {
        SpringApplication.run(TurbineApp.class, args);
    }
}
