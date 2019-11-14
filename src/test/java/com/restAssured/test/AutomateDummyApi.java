package com.restAssured.test;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

/**
 * @author krishna
 *          Here is a simple example where
 *          we are trying automate this API TESTING
 *          If HTTP_STATUS_CODE IS 200 , it means API is giving response
 *          with out any error.
 */
public class AutomateDummyApi {

    @Test
    public void validateDummyApiStatusCode(){
        given().get("http://dummy.restapiexample.com/api/v1/employee/1").then().statusCode(200).log().all();
    }
}
