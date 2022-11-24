package com.petstore.octoperf.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/login.feature",
        glue = {"com.petstore.octoperf.stepdefinitions"},
        snippets = CucumberOptions.SnippetType.CAMELCASE, tags = "")

public class PrimaryRunner {
}
