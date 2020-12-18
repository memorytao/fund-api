package com.utils;

import java.util.Collection;
import java.util.Collections;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

@Configuration
public class DBConnect extends AbstractMongoClientConfiguration {

	@Override
	protected String getDatabaseName() {
		// TODO Auto-generated method stub
		return "investment";
	}

	@Override
	public MongoClient mongoClient() {
		// TODO Auto-generated method stub
//		return super.mongoClient();
		ConnectionString connectionString = new ConnectionString("mongodb://localhost:27017/investment");
		MongoClientSettings mongoClientSettings = MongoClientSettings.builder().applyConnectionString(connectionString)
				.build();

		return MongoClients.create(mongoClientSettings);
	}

	
	@Override
	protected Collection<String> getMappingBasePackages() {
		// TODO Auto-generated method stub
		return Collections.singleton("com.utils");
	}
}
