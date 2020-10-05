package com.c505whu.watchservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author thc
 * @Title:
 * @Package com.c505whu.watchservice
 * @Description:
 * @date 2020/10/5 6:50 下午
 */

@SpringBootApplication
@ComponentScan(basePackages = {"com.c505whu", "com.thc"})
public class WatchApplication {
    public static void main(String[] args) {
        SpringApplication.run(WatchApplication.class, args);
    }
}
