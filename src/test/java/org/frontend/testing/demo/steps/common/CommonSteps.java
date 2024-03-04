package org.frontend.testing.demo.steps.common;


import io.cucumber.java.es.Dado;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Scroll;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.frontend.testing.demo.steps.hooks.Actors.COMMON_ACTOR;

public class CommonSteps {
    @Dado("que Yaremis ingresa al modulo de {string} de la aplicación")
    public void navigateToPage(String namePage) {

        switch (namePage) {
            case "Book Store Application -> Login":
                COMMON_ACTOR.attemptsTo(Open.browserOn().thePageNamed("module.store.login"));
                break;
            case "Book Store Application -> Book Store":
                COMMON_ACTOR.attemptsTo(Open.browserOn().thePageNamed("module.store.books"));
                break;
            case "Forms -> Practice Form":
                COMMON_ACTOR.attemptsTo(Open.browserOn().thePageNamed("module.forms.practice"));
                break;
            case "Frames -> Nested Frames":
                COMMON_ACTOR.attemptsTo(Open.browserOn().thePageNamed("module.frame.nested"));
                break;
        }
    }
}


