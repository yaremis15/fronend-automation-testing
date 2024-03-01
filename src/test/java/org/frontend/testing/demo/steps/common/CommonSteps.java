package org.frontend.testing.demo.steps.common;


import io.cucumber.java.es.Dado;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Scroll;

import static org.frontend.testing.demo.steps.hooks.Actors.COMMON_ACTOR;

public class CommonSteps {
    @Dado("que Yaremis ingresa a la sección de Book Store Application")
    public void navigateToBookStorePage() throws InterruptedException {
        COMMON_ACTOR.attemptsTo(Open.browserOn().thePageNamed("pages.demo"));
    }
}


