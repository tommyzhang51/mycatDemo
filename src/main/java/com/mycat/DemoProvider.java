package com.mycat;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by tommy on 2018/6/13.
 */
@MapperScan("com.mycat.mapper")
@SpringBootApplication
public class DemoProvider {
    public static void main(String[] args) {
        SpringApplication.run(DemoProvider.class, args);
    }
}
