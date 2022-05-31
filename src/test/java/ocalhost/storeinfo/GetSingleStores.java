package ocalhost.storeinfo;

import io.restassured.response.Response;
import ocalhost.testbase.TestBase;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetSingleStores extends TestBase {
    @Test

    public void readServicesList(){
        Response response = given()
                .when()
                .get("/services");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
