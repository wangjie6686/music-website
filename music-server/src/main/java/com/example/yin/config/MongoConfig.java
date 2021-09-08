package com.example.yin.config;

import lombok.Data;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Data
@Configuration
@ConfigurationProperties(prefix =   "spring.data.mongodb.custom")
public class MongoConfig {
    private Integer minConnections;

    private Integer maxConnections;

    private List<String > host;

    private List<Integer >port;

    private String database;

    private String username;

    private String password;


}
