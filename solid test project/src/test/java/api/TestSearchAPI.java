package api;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;

public class TestSearchAPI 
{

    @Test
    public void testSearch() {
        RestAssured.baseURI = "https://staging-api.solidcab.example/api";

        RestAssured
            .given()
                .contentType(ContentType.JSON)
                .body("{\"origin\": \"Pune\", \"destination\": \"Lonavala\", \"date\": \"2025-12-01\"}")
            .when()
                .post("/search")
            .then()
                .statusCode(200)
                .body("vehicles", notNullValue());
    }
}
