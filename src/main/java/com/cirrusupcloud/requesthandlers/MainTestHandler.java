package com.cirrusupcloud.requesthandlers;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.SystemPropertiesCredentialsProvider;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;

/**
 * Main class for testing request handlers feature.
 */
public class MainTestHandler {

    public static void main(String[] args) {
        AWSCredentials credentials = new SystemPropertiesCredentialsProvider().getCredentials();
        AmazonDynamoDBClient dynamoDB = new AmazonDynamoDBClient(credentials);

        dynamoDB.addRequestHandler(new TestHandler());

        dynamoDB.listTables();
        System.out.println("-----");
        dynamoDB.describeTable("unexistent-table");
    }
}
