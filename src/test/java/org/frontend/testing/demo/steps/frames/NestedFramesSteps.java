package org.frontend.testing.demo.steps.frames;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.ensure.Ensure;

import static org.frontend.testing.demo.pages.bookStore.LoginPage.BUTTON_LOGIN;
import static org.frontend.testing.demo.steps.hooks.Actors.COMMON_ACTOR;

public class NestedFramesSteps {
    @Cuando("pending one")
    public void pendingOne() {
    }

    @Entonces("pending two")
    public void pendingTwo() {
    }
}
