package api_tests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

class api_testing {
    @BeforeAll
    public static void setup() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
    }

    @Test
    public void post_request() {
        String requestBody = "{\n" +
                "  \"title\": \"post\",\n" +
                "  \"body\": \"test\",\n" +
                "  \"userId\": \"2\" \n}";

        Response response = given()
                .header("Content-type", "application/json")
                .and()
                .body(requestBody)
                .when()
                .post("/posts")
                .then()
                .extract().response();

        Assertions.assertEquals(201, response.statusCode());
        Assertions.assertEquals("post", response.jsonPath().getString("title"));
        Assertions.assertEquals("test", response.jsonPath().getString("body"));
        Assertions.assertEquals("2", response.jsonPath().getString("userId"));
        Assertions.assertEquals("101", response.jsonPath().getString("id"));

        System.out.println("******************\nPOST: " + response.statusCode());
    }
    @Test
    public void get_request() {
        Response response = given()
                .contentType(ContentType.JSON)
                .when()
                .get("/posts")
                .then()
                .extract().response();

        Assertions.assertEquals(200, response.statusCode());
        Assertions.assertEquals("qui est esse", response.jsonPath().getString("title[1]"));
        System.out.println("******************\nGET: " + response.statusCode());
    }

}
