package com.example.yin.config;

import com.mongodb.*;
import com.mongodb.MongoClient;
import com.mongodb.client.*;
import com.mongodb.client.gridfs.GridFSBucket;
import com.mongodb.client.gridfs.GridFSBuckets;
import lombok.Data;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class MongodbConfiguration {
      @Autowired
      private MongoConfig mongoConfig;

      @Bean
      public MongoDbFactory getMongoDbFactory(){
            MongoClientOptions.Builder builder = new MongoClientOptions.Builder();
            builder.connectionsPerHost(mongoConfig.getMaxConnections());
            builder.minConnectionsPerHost(mongoConfig.getMinConnections());
            builder.readPreference(ReadPreference.secondaryPreferred());

            MongoClientOptions mongoClientOptions = builder.build();
            //地址列表
            List<ServerAddress> serverAddresses = new ArrayList<>();
            for (String host :mongoConfig.getHost() ) {
                  int index = mongoConfig.getHost().indexOf(host);
                  Integer port = mongoConfig.getPort().get(index);

                  ServerAddress serverAddress = new ServerAddress(host,port);
                  serverAddresses.add(serverAddress);
            }

            //连接认证
            List<MongoCredential> mongoCreDentialList = new ArrayList<>();
            if(mongoConfig.getUsername()!=null){
                  mongoCreDentialList.add(MongoCredential.createCredential(mongoConfig.getUsername(),mongoConfig.getDatabase(),mongoConfig.getPassword().toCharArray()));
            }
            System.out.println("mongoDb MongoCredential:"+mongoCreDentialList.toString());

            MongoClient mongoClient  = new MongoClient(serverAddresses,mongoCreDentialList,mongoClientOptions);
            return new SimpleMongoDbFactory(mongoClient,mongoConfig.getDatabase());
      }

      @Bean(name = "mongoTemplate")
      @Autowired
      public MongoTemplate getMongoTemplate(MongoDbFactory mongoDbFactory){
            return new MongoTemplate(mongoDbFactory);
      }

      @Bean(name = "gridFSBucket")
      public GridFSBucket getGridFSBucket(){
            MongoDatabase db = getMongoDbFactory().getDb();
            return GridFSBuckets.create(db);
      }
}
