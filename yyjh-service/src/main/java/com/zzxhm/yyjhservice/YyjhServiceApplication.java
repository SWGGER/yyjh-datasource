package com.zzxhm.yyjhservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zzxhm.yyjhservice")
public class YyjhServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(YyjhServiceApplication.class, args);
    }

}
