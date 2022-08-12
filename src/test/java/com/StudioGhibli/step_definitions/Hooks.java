package com.StudioGhibli.step_definitions;

import cucumber.api.Scenario;
import io.cucumber.java.Before;
import org.junit.Assume;

public class Hooks {

    @Before("@skip")
    public void skip_scenario(Scenario scenario){
        System.out.println("SKIP SCENARIO: " + scenario.getName());
        Assume.assumeTrue(false);
    }
}
