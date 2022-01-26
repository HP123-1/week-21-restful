package com.restful.testbase;

import com.restful.constants.Path;
import com.restful.utils.PropertyReader;
import io.restassured.RestAssured;
import org.junit.BeforeClass;


public class TestBase {

    public static PropertyReader propertyReader;

    @BeforeClass
    public static void initialize(){
        propertyReader = PropertyReader.getInstance();
        RestAssured.baseURI = propertyReader.getProperty("baseUrl");
        RestAssured.basePath = Path.BOOKING;
    }
}
