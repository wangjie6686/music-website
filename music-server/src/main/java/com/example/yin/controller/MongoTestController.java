package com.example.yin.controller;


import com.example.yin.config.MongoUtils;
import com.example.yin.entity.MongoInfo;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
public class MongoTestController {


    @RequestMapping(value = "/testMongo", method = RequestMethod.GET)
    public void testMongo(HttpServletRequest req){
        System.out.println("start--------------");
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String type = req.getParameter("type");

        System.out.println("id: "+id + "---name:"+name + "---type:"+type );

        MongoInfo info = new MongoInfo();
        info.setId(id);
        info.setName(name);
        info.setType(type);
        MongoUtils.save(info,"cr_music");
        System.out.println("end--------------");

    }
}
