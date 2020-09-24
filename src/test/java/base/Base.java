package base;

import io.restassured.RestAssured;
import io.restassured.config.LogConfig;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.config;
import static io.restassured.RestAssured.given;

public class Base {

    private static String URL_API = "https://pokeapi.co/api/v2/";
    protected Map<String, String> params = new HashMap<String, String>();
    protected Response response;


    protected void requestGetWithParams(String path, Map<String, String> params, int codigo) {
        response = RestAssured
                .given()
                .baseUri(URL_API)
                .when()
                .params(params)
                .get(path)
                .then()
                .statusCode(codigo)
                .extract()
                .response();
    }

    protected void requestGetWithId(String path, String id, int codigo) {
        response = RestAssured
                .given()
                .baseUri(URL_API)
                .when()
                .pathParam("id", id)
                .get(path)
                .then()
                .statusCode(codigo)
                .extract()
                .response();
    }

    protected void logResponse() {
        System.out.println(response.prettyPrint());
    }


}