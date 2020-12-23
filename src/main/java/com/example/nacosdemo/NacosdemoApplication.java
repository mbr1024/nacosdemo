package com.example.nacosdemo;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@NacosPropertySource(dataId = "example", autoRefreshed = true)
@SpringBootApplication
public class NacosdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosdemoApplication.class, args);
    }

}
