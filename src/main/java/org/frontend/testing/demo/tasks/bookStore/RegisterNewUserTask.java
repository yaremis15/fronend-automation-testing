package org.frontend.testing.demo.tasks.bookStore;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import org.frontend.testing.demo.pages.bookStore.LoginPage;
import org.frontend.testing.demo.pages.bookStore.RegisterPage;

import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegisterNewUserTask implements Task {
    // private final RegisterNewUserData userData;

    private final Map<String, String> userData;

    public RegisterNewUserTask(Map<String, String> userData) {
        this.userData = userData;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(LoginPage.BUTTON_NEW_USER),
                Click.on(LoginPage.BUTTON_NEW_USER).afterWaitingUntilEnabled(),
                Enter.theValue(userData.get("First Name")).into(RegisterPage.INPUT_FIRST_NAME),
                Enter.theValue(userData.get("Last Name")).into(RegisterPage.INPUT_LAST_NAME),
                Enter.theValue(userData.get("UserName")).into(RegisterPage.INPUT_USER_NAME),
                Enter.theValue(userData.get("Password")).into(RegisterPage.INPUT_PASSWORD),
                Scroll.to(RegisterPage.BUTTON_REGISTER),
                Click.on(RegisterPage.BUTTON_REGISTER).afterWaitingUntilEnabled()
        );
    }

    public static RegisterNewUserTask withUserData(Map<String, String> userData) {
        return instrumented(RegisterNewUserTask.class, userData);
    }
}
