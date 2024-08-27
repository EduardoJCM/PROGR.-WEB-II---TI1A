package com.miempresa.crudproductos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.miempresa.crudproductos.model")
public class CrudProductosApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudProductosApplication.class, args);
    }
}
