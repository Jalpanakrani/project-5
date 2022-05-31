package ocalhost.serviceinfo;

import io.restassured.response.Response;
import ocalhost.testbase.TestBase;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetSingleService extends TestBase {
    @Test

    public void readServicesList(){
        Response response = given()
                .when()
                .get("/services/5");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
