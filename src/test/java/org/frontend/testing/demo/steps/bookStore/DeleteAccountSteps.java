package org.frontend.testing.demo.steps.bookStore;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.HtmlAlert;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.ui.Button;
import org.frontend.testing.demo.interactions.WaitToLoad;
import org.frontend.testing.demo.tasks.bookStore.DeleteAccountTask;
import org.frontend.testing.demo.tasks.bookStore.LoginUserTask;
import org.openqa.selenium.Keys;

import java.util.List;
import java.util.Map;

import static org.frontend.testing.demo.pages.bookStore.LoginPage.BUTTON_LOGIN;
import static org.frontend.testing.demo.pages.bookStore.ProfilePage.LABEL_USER_NAME;
import static org.frontend.testing.demo.pages.forms.PracticeFormPage.LABEL_FORM_TITLE_COMPLETE;
import static org.frontend.testing.demo.steps.hooks.Actors.COMMON_ACTOR;
import static org.hamcrest.MatcherAssert.assertThat;

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
                Ensure.that(BUTTON_LOGIN).isDisplayed()
        );
    }
}
