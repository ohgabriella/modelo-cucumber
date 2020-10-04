package base;

import io.restassured.RestAssured;
import io.restassured.config.LogConfig;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import java.util.HashMap;
import java.util.Map;

public class Base {

    private static String URL_API = "https://pokeapi.co/api/v2/";
    protected Map<String, String> params = new HashMap<>();
    protected Response response;


    protected void requestGetWithParams(String path, Map<String, String> params, int codigo) {
        response = RestAssured
                .given()
                .filter(new RequestLoggingFilter())
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
                .filter(new RequestLoggingFilter())
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

    protected int statusCode() {
        System.out.println("Status code: " + response.getStatusCode());
        return response.getStatusCode();
    }

}