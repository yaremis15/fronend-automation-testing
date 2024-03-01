package org.frontend.testing.demo.steps.hooks;


import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;

import static org.frontend.testing.demo.steps.hooks.Actors.COMMON_ACTOR;

public class steps {
    @Dado("que Yaremis quiere validar el ingreso a la pagina Demo Qa")
    public void navigateToHomePage() {
        COMMON_ACTOR.attemptsTo(Open.browserOn().thePageNamed("pages.demo"));

    }

    @Cuando("ingrese la url en el buscador")
    public void ingreseLaUrlEnElBuscador() {

    }

    @Entonces("podra validar el ingreso a la pagina web Demo Qa")
    public void podraValidarElIngresoALaPaginaWebDemoQa() {

    }

}


