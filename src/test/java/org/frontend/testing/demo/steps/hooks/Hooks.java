package org.frontend.testing.demo.steps.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.frontend.testing.demo.steps.hooks.Actors.COMMON_ACTOR;

public class Hooks {

    private static final Logger LOG = LoggerFactory.getLogger(Hooks.class.getSimpleName());
    WebDriver driver = Serenity.getDriver();


    @Before
    public void settingTheStage() {
        OnStage.setTheStage(new OnlineCast());
        COMMON_ACTOR.whoCan(BrowseTheWeb.with(driver));
        COMMON_ACTOR.describedAs("Tester de Credibanco");

    }

    @After
    public void afterScenario() {

    }
}
