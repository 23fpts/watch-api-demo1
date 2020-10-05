package com.c505whu.watchservice.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author thc
 * @Title:
 * @Package com.c505whu.watchservice.config
 * @Description:
 * @date 2020/10/5 6:53 下午
 */
@Configuration
@MapperScan("com.c505whu.**.mapper")
public class WatchConfig {

}
