package com.StudioGhibli.utilities;

public class Environment {

    public static final String BASE_URL;
    public static final String Films;
    public static final String People;
    public static final String Locations;
    public static final String Species;
    public static final String Vehicles;

    static {
        BASE_URL = ConfigurationReader.get("BaseURL");

        // Endpoint list
        Films = "/films";
        People = "/people";
        Locations = "/locations";
        Species = "/species";
        Vehicles = "/vehicles";
    }

}
