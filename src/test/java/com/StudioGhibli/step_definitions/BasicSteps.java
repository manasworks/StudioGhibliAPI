package com.StudioGhibli.step_definitions;

import com.StudioGhibli.utilities.APIUtils;
import com.StudioGhibli.utilities.Environment;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;

import static io.restassured.RestAssured.given;

public class BasicSteps {

    private Response response;

    @Given("user send request to {string} endpoint")
    public void user_send_request_to_endpoint(String endpoint) {
        endpoint = APIUtils.setEndpoint(endpoint);
        response = given().accept(ContentType.JSON).get(Environment.BASE_URL + endpoint);
    }


    @Then("verify response status code is {int}")
    public void verify_response_status_code_is(int expectedStatusCode) {
        int actualStatusCode = response.statusCode();

        System.out.println("Actual Status code: "+actualStatusCode);
        System.out.println("Expected Status code: "+expectedStatusCode);

        Assert.assertEquals(actualStatusCode, expectedStatusCode);
    }

    @Then("retrieve a film by name {string}")
    public void retrieve_a_film_by_name(String filmName) {
        String film = APIUtils.getFilmByName(response, filmName);

        System.out.println(film);
    }
}
