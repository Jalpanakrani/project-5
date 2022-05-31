package ocalhost.productinfo;

import com.sun.org.apache.bcel.internal.classfile.Utility;
import io.restassured.response.Response;
import ocalhost.testbase.TestBase;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetSigleProductListTest extends TestBase {
    @Test
    public void readProductList() {
        Response response = given()
                .pathParam("id",48530)
                .when()
                .get("/products/{id}");
        response.prettyPrint();
        response.then().statusCode(200);
    }

}
