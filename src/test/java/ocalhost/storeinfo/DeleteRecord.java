package ocalhost.storeinfo;

import io.restassured.response.Response;
import ocalhost.testbase.TestBase;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class DeleteRecord extends TestBase {
    @Test
    public void deleteRecord() {
        Response response = given()
                .when()
                .delete("/services/5");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
