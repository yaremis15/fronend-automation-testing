package org.frontend.testing.demo.steps.forms;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.frontend.testing.demo.pages.forms.PracticeFormPage.*;
import static org.frontend.testing.demo.questions.GetTextFromTarget.locatorTextIs;
import static org.frontend.testing.demo.steps.hooks.Actors.COMMON_ACTOR;
import static org.frontend.testing.demo.tasks.forms.PracticeFormTask.fillOutStudentRegistrationFormWithUserData;
import static org.hamcrest.Matchers.equalTo;

public class PracticeFormSteps {
    @Cuando("ella diligencia la siguiente información del formulario de inscripción")
    public void fillInTheInformationInTheRequiredFields(List<Map<String, String>> userData) throws InterruptedException {
        Map<String, String> studentInformation = userData.get(0);

        COMMON_ACTOR.attemptsTo(
                fillOutStudentRegistrationFormWithUserData(studentInformation));
    }

    @Entonces("se podrá visualizar el modal {string} con la información diligenciada anteriormente")
    public void validateInformationStudentRegistrationForm(String titleModal) {
        COMMON_ACTOR.attemptsTo(
                Ensure.that(LABEL_FORM_TITLE_COMPLETE).text().isEqualTo(titleModal)
        );

        COMMON_ACTOR.should(
                seeThat(("the displayed Title of Completed Form"),
                        locatorTextIs(LABEL_FORM_TITLE_COMPLETE), equalTo(titleModal)
                ));

        COMMON_ACTOR.attemptsTo(Click.on(BUTTON_CLOSE_MODAL_FORM).afterWaitingUntilPresent());
    }
}