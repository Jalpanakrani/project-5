package ocalhost.storeinfo;

import io.restassured.response.Response;
import ocalhost.model.StorePojo;
import ocalhost.testbase.TestBase;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PostTestCteatStoreRecord extends TestBase {
        @Test
        public void creatStoreRecord(){
            StorePojo storePojo = new StorePojo();
            storePojo.setAddress("String");
            storePojo.setAddress2("String");
            storePojo.setCity("String");
            storePojo.setName("String");
            storePojo.setType("String");
            storePojo.setLat(0);
            storePojo.setHours("String");
            storePojo.setLng(0);
            storePojo.setZip("string");
            storePojo.setState("string");
            Response response = given()
                    .header("content-type","application/json")
                    .when()
                    .body(storePojo)
                    .post("/stores");
            response.then().statusCode(201);
            response.prettyPrint();
        }}