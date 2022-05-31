package ocalhost.storeinfo;

import io.restassured.response.Response;
import ocalhost.model.ServicesPojo;
import ocalhost.testbase.TestBase;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PatchTestForUpdateRecord extends TestBase {
    @Test
    public void creatService(){
        ServicesPojo servicePoJo = new ServicesPojo();
        servicePoJo.setName("String");
        Response response = given()
                .header("content-type","application/json")
                .when()
                .body(servicePoJo)
                .put("/services/15");
        response.then().statusCode(200);
        response.prettyPrint();
    }

}
