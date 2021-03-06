package com.my;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.my.dao")
public class Demo4Application {

    public static void main(String[] args) {

        SpringApplication.run(Demo4Application.class, args);
        System.out.println(Runtime.getRuntime().availableProcessors());
    }

}
