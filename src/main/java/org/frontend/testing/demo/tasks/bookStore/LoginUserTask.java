package org.frontend.testing.demo.tasks.bookStore;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.frontend.testing.demo.pages.bookStore.LoginPage.*;

public class LoginUserTask implements Task {
    private final Map<String, String> userData;

    public LoginUserTask(Map<String, String> userData) {
        this.userData = userData;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(INPUT_USER_NAME).afterWaitingUntilEnabled(),
                Enter.theValue(userData.get("UserName")).into(INPUT_USER_NAME),

                Click.on(INPUT_PASSWORD).afterWaitingUntilEnabled(),
                Enter.theValue(userData.get("Password")).into(INPUT_PASSWORD),

                Click.on(BUTTON_LOGIN).afterWaitingUntilEnabled()
        );
    }

    public static LoginUserTask withUserData(Map<String, String> userData) {
        return instrumented(LoginUserTask.class, userData);
    }
}
