package com.example.yin.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = {"com.example.yin.dao"})
public class MybatisPlusConfig {
}
