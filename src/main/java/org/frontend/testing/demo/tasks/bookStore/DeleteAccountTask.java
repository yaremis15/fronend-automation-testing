package org.frontend.testing.demo.tasks.bookStore;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import org.frontend.testing.demo.interactions.SwitchToAlert;
import org.frontend.testing.demo.interactions.WaitToLoad;

import java.time.Duration;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.frontend.testing.demo.pages.bookStore.ProfilePage.DELETE_ACCOUNT_BUTTON;
import static org.frontend.testing.demo.pages.bookStore.ProfilePage.OK_BUTTON_TO_DELETE_ACCOUNT;

public class DeleteAccountTask implements Task {
    public DeleteAccountTask() {
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(DELETE_ACCOUNT_BUTTON),

                Click.on(DELETE_ACCOUNT_BUTTON.waitingForNoMoreThan(Duration.ofSeconds(8))),

                Click.on(OK_BUTTON_TO_DELETE_ACCOUNT).afterWaitingUntilEnabled(),
                WaitToLoad.theMiliSeconds(1000)
        );
    }

    public static DeleteAccountTask fromTheProfileModule() {
        return instrumented(DeleteAccountTask.class);
    }
}
