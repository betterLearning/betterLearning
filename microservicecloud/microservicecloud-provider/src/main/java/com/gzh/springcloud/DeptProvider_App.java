package com.gzh.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan(value ="com.gzh.springcloud.dao")
public class DeptProvider_App {
    
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider_App.class, args);
    }
    
}
