package com.kish.eshop.hystrix;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableTurbine
public class HystrixTurbineServerApplicaion {

    public static void main(String[] args) {
        new SpringApplicationBuilder(HystrixTurbineServerApplicaion.class).web(true).run(args);
    }
	
}