package ocalhost.storeinfo;

import io.restassured.response.Response;
import ocalhost.testbase.TestBase;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetStoreslist extends TestBase {
    @Test
    public void getSingleRecord(){
        Response response = given()
                .when()
                .get("/stores/13");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
