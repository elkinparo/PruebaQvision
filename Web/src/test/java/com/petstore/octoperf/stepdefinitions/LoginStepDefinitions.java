package com.petstore.octoperf.stepdefinitions;


import com.petstore.octoperf.questions.FinalMessage;
import com.petstore.octoperf.tasks.loggin;
import com.petstore.octoperf.utils.Generate;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.regex.Matcher;

public class LoginStepDefinitions
{
    @Managed
    WebDriver driver;

    @Given("actor opens browser")
    public void actorOpensBrowser() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Elkin").whoCan(BrowseTheWeb.with(driver));
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://petstore.octoperf.com/actions/Catalog.action"));
    }
    @When("send unregistered username and password")
    public void sendUnregisteredUsernameAndPassword() {
        OnStage.theActorInTheSpotlight().attemptsTo(loggin.format(Generate.information()));

    }
    @Then("I see the message from {string}")
    public void iSeeTheMessageFrom(String message)
    {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(FinalMessage.is(), Matchers.equalTo(message)));
    }


}
