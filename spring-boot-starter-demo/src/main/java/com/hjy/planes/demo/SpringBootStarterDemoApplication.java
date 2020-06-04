package com.hjy.planes.demo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
@ComponentScan(basePackages = {"com.hjy.planes"})
public class SpringBootStarterDemoApplication implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootStarterDemoApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(simpleDateFormat.format(new Date()));
    }

    @Resource(type = SimpleDateFormat.class)
    private SimpleDateFormat simpleDateFormat;

}
