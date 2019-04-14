package com.farmer.mongo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.authentication.UserCredentials;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongodb.MongoClient;

@Configuration
@ComponentScan(basePackages="com.farmer")
public class MongoConfig {
	@Bean
	public MongoDbFactory mongoDbFactory() {
		MongoClient mongoClient = new MongoClient("localhost", 27017);
		UserCredentials userCredentials = new UserCredentials("", "");
		return new SimpleMongoDbFactory(mongoClient, "farmerBidding");
	}
	
	@Bean
	public MongoTemplate mongoTemplate() {
		MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory());
		return mongoTemplate;
	}
	
	
	
}
