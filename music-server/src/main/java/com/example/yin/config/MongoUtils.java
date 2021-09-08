package com.example.yin.config;

import com.mongodb.client.gridfs.GridFSBucket;
import com.mongodb.client.gridfs.GridFSBuckets;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Collection;

@Component
public class MongoUtils {
    @Autowired(required=true)
    private GridFSBucket gridFSBucket;

   // @Autowired(required=true)
    //private GridFsTemplate gridFsTemplate;

    @Autowired
    private MongoTemplate mongoTemplate;

    public static MongoUtils mongoUtils;

    @PostConstruct
    public void init(){
        mongoUtils = this;
        mongoUtils.mongoTemplate = this.mongoTemplate;
        mongoUtils.gridFSBucket = this.gridFSBucket;
       // mongoUtils.gridFsTemplate = this.gridFsTemplate;
    }


    public static Object save(Object obj){
        return mongoUtils.mongoTemplate.save(obj);
    }

    public static Object save(Object obj, String  col){
        return mongoUtils.mongoTemplate.save(obj,col);
    }
}
