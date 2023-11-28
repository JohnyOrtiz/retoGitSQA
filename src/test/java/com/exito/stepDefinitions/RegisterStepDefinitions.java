package com.exito.stepDefinitions;

import com.exito.questions.ValidateElement;
import com.exito.tasks.HomeTask;
import com.exito.ui.HomeUI;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegisterStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
        WebDriverManager.chromedriver().setup();
    }

    @Given("User open Exito site")
    public void userOpenExitoSite() {
        theActorCalled("User").wasAbleTo(Open.url("https://www.exito.com/"));
    }

    @When("User enters item name")
    public void userEntersItemName() {
        theActorInTheSpotlight().attemptsTo(HomeTask.on());
    }

    @Then("User sees item's title")
    public void userSeesItemsTitle() {
        theActorInTheSpotlight().should(seeThat(ValidateElement.isVisible(HomeUI.SPAN_ITEM_CART)));
    }
}
