package com.petstore.octoperf.stepdefinitions;

import com.petstore.octoperf.tasks.register;
import com.petstore.octoperf.userinterfaces.Register;
import com.petstore.octoperf.utils.Generate;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class RegisterUserStepDefinitions {

    @When("the actor is register in the page")
    public void theActorIsRegisterInThePage() {
        OnStage.theActorInTheSpotlight().attemptsTo(register.format(Generate.dates()));
    }

    @Then("see home page")
    public void seeHomePage() {
        OnStage.theActorInTheSpotlight().attemptsTo(WaitUntil.the(Register.IMAGE, WebElementStateMatchers.isVisible()));
    }

}
