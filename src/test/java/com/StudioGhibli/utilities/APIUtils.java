package com.StudioGhibli.utilities;

import com.StudioGhibli.pojos.Film;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.junit.Assert;

import static io.restassured.RestAssured.given;

public class APIUtils {

    public static String setEndpoint(String endpoint){
        endpoint=endpoint.toLowerCase();
        switch (endpoint){
            case "films":
                endpoint = Environment.Films;
                break;
            case "people":
                endpoint = Environment.People;
                break;
            case "locations":
                endpoint = Environment.Locations;
                break;
            case "species":
                endpoint = Environment.Species;
                break;
            case "vehicles":
                endpoint = Environment.Vehicles;
                break;
            default:
                Assert.fail("Wrong endpoint name!  Can be: films, people, locations, species or vehicles");
        }
        return endpoint;
    }

    public static String getFilmByName(Response response, String name){

        Film[] allFilms = response.as(Film[].class);

        for (Film eachFilm : allFilms) {
            if (eachFilm.getTitle().equals(name)){
                return eachFilm.toString();
            }
        }
        Assert.fail("\"Film by that name not found!\"");
        return "";
    }

}
