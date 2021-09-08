package com.example.yin;

import com.example.yin.config.MongoUtils;
import com.example.yin.entity.MongoInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Base64;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestClass {


    @Autowired
    MongoTemplate mongoTemplate;

    @Test
    public void test(){
        System.out.println("start--------------");
        MongoInfo info = new MongoInfo();
        info.setId("9");
        info.setName("test9");

        info.setType("test9");
        MongoUtils.save(info,"cr_music");

        System.out.println("end--------------");
    }

}
