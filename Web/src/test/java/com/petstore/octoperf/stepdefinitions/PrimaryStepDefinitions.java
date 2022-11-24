package com.petstore.octoperf.stepdefinitions;

import com.petstore.octoperf.tasks.loggin;
import com.petstore.octoperf.utils.Generate;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class PrimaryStepDefinitions
{
    @Managed
    WebDriver driver;

    @Given("actor opens browser")
    public void actorOpensBrowser() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Elkin").whoCan(BrowseTheWeb.with(driver));
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://petstore.octoperf.com/actions/Catalog.action"));

    }
    @When("I send the username and password")
    public void iSendTheUsernameAndPassword() {
        OnStage.theActorInTheSpotlight().attemptsTo(loggin.format(Generate.datashoping()));
    }
    @Then("look at the pets page")
    public void lookAtThePetsPage() {

    }


}
