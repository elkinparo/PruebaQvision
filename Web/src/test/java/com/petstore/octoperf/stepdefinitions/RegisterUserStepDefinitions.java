package com.petstore.octoperf.stepdefinitions;

import com.petstore.octoperf.questions.FinalMessage;
import com.petstore.octoperf.tasks.loggin;
import com.petstore.octoperf.tasks.register;
import com.petstore.octoperf.userinterfaces.Logginn;
import com.petstore.octoperf.userinterfaces.Register;
import com.petstore.octoperf.utils.Generate;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

public class RegisterUserStepDefinitions
{

    @When("the actor is register in the page")
    public void theActorIsRegisterInThePage() {
        OnStage.theActorInTheSpotlight().attemptsTo(register.format(Generate.dates()));
    }
    @Then("see home page")
    public void seeHomePage(String message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(FinalMessage.is(), Matchers.equalTo(message)));
    }

}
