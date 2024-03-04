package org.frontend.testing.demo.steps.bookStore;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.frontend.testing.demo.interactions.SwitchToAlert;
import org.frontend.testing.demo.interactions.WaitToLoad;
import org.frontend.testing.demo.tasks.bookStore.DeleteAccountTask;
import org.frontend.testing.demo.tasks.bookStore.LoginUserTask;

import java.util.List;
import java.util.Map;

import static org.frontend.testing.demo.pages.bookStore.LoginPage.BUTTON_LOGIN;
import static org.frontend.testing.demo.pages.bookStore.LoginPage.LABEL_INVALID_LOGIN;
import static org.frontend.testing.demo.pages.bookStore.ProfilePage.LABEL_USER_NAME;
import static org.frontend.testing.demo.steps.hooks.Actors.COMMON_ACTOR;
import static org.frontend.testing.demo.utils.Constants.INVALID_LOGIN_MESSAGE;

public class DeleteAccountSteps {

    @Dado("que Yaremis se loguea con sus credenciales en la sección de Book Store")
    public void userAccessesTheApplication(List<Map<String, String>> userData) {
        Map<String, String> userCredentials = userData.get(0);

        COMMON_ACTOR.attemptsTo(
                LoginUserTask.withUserData(userCredentials),
                Ensure.that(LABEL_USER_NAME).text().isEqualTo(userCredentials.get("UserName"))
        );
    }

    @Cuando("ella elimina la cuenta de su usuario del aplicativo")
    public void deleteUserAccount() {
        COMMON_ACTOR.attemptsTo(
                DeleteAccountTask.fromTheProfileModule()
        );
    }

    @Entonces("se podrá visualizar la alerta con el mensaje {string} al confirmar la eliminación")
    public void validateAlertMessageForDeleteAccount(String messageAlert) {
        COMMON_ACTOR.attemptsTo(
                SwitchToAlert.confirmation(),
                Ensure.that(BUTTON_LOGIN).isDisplayed(),
                WaitToLoad.theMiliSeconds(1000)
        );
    }

    @Y("no se deberá permitir el ingreso al aplicativo con las credenciales de la cuenta eliminada")
    public void notAllowUserToLogin(List<Map<String, String>> userData) {
        Map<String, String> userCredentials = userData.get(0);

        COMMON_ACTOR.attemptsTo(
                LoginUserTask.withUserData(userCredentials),
                Scroll.to(LABEL_INVALID_LOGIN),
                WaitToLoad.theMiliSeconds(1000),
                Ensure.that(LABEL_INVALID_LOGIN).text().isEqualTo(INVALID_LOGIN_MESSAGE)
        );
    }
}
