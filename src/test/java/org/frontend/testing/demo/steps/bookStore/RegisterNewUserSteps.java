package org.frontend.testing.demo.steps.bookStore;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import org.frontend.testing.demo.tasks.bookStore.RegisterNewUserTask;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

import static org.frontend.testing.demo.steps.hooks.Actors.COMMON_ACTOR;

public class RegisterNewUserSteps {

    private static final Logger logger = LoggerFactory.getLogger(RegisterNewUserSteps.class);

    @Cuando("ella diligencia la información de los campos requeridos")
    public void enterUserInformationToRegister(List<Map<String, String>> userData) {
        Map<String, String> userRegisterData = userData.get(0);

        COMMON_ACTOR.attemptsTo(
                RegisterNewUserTask.withUserData(userRegisterData));
    }

    @Entonces("se podrá visualizar la alerta con el mensaje {string} al crear el usuario")
    public void validateAlertMessageForUserCreation(String message) {

        logger.error("No se puede validar porque se tiene un recaptcha que bloquea el registro");

    }
}
