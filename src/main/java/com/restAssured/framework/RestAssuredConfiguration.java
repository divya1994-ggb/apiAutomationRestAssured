package com.restAssured.framework;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

/**
 * For the time being ignore this class
 */
public class RestAssuredConfiguration {

    public RequestSpecification getRequestSpecification(){
        return RestAssured.given().contentType(ContentType.JSON);
    }
}
