package com.starylwu.medicalform;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.starylwu.medicalform.dao"})
public class MedicalFormApplication {

    public static void main(String[] args) {
        SpringApplication.run(MedicalFormApplication.class, args);
    }
}
