package com.example.yin.domain;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Admin {
    private Integer id;

    private String name;

    private String password;
}
