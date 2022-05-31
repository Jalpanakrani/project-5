package ocalhost.productinfo;

import io.restassured.response.Response;
import ocalhost.testbase.TestBase;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class DeleteRecord extends TestBase {
    @Test
    public void deleteProduct(){
        Response response = given()
                .when()
                .delete("/products/127687");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
