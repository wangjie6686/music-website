package com.example.yin.entity;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class MongoInfo  {

    private Integer id;
    private String name;
    private String type;
    private String address;
}
