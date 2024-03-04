package org.frontend.testing.demo.tasks.forms;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import org.frontend.testing.demo.pages.forms.PracticeFormPage;
import org.openqa.selenium.Keys;

import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.frontend.testing.demo.pages.forms.PracticeFormPage.*;
import static org.frontend.testing.demo.utils.Constants.PATH_FILE_TO_LOAD;

public class PracticeFormTask implements Task {


    private final Map<String, String> formData;

    public PracticeFormTask(Map<String, String> formData) {
        this.formData = formData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                (Performable) Click.on(INPUT_FIRST_NAME).afterWaitingUntilEnabled(),
                Enter.theValue(formData.get("First Name")).into(INPUT_FIRST_NAME),

                Click.on(INPUT_LAST_NAME),
                Enter.theValue(formData.get("Last Name")).into(INPUT_LAST_NAME),

                Click.on(INPUT_USER_EMAIL),
                Enter.theValue(formData.get("Email")).into(INPUT_USER_EMAIL),

                Click.on(RADIO_BUTTON_GENDER),

                Enter.theValue(formData.get("Mobile")).into(INPUT_USER_MOBILE),

                Click.on(INPUT_DATE_OF_BIRTH), Clear.field(INPUT_DATE_OF_BIRTH),
                Enter.theValue(formData.get("Birth")).into(INPUT_DATE_OF_BIRTH),
                Hit.the(Keys.ENTER).into(INPUT_DATE_OF_BIRTH),

                Scroll.to(SELECTOR_CITY_ADDRESS),

                Click.on(INPUT_AUTO_COMPLETE_SUBJECTS),
                Enter.theValue(formData.get("Subjects")).into(INPUT_AUTO_COMPLETE_SUBJECTS),
                Hit.the(Keys.ENTER).into(INPUT_AUTO_COMPLETE_SUBJECTS),

                Click.on(CHECKBOX_MUSIC_HOBBIES),

                Upload.theFile(PATH_FILE_TO_LOAD).to(INPUT_UPLOAD_PICTURE).usingLocalFileDetector(),

                Click.on(INPUT_CURRENT_ADDRESS),
                Enter.theValue(formData.get("CurrentAddress")).into(INPUT_CURRENT_ADDRESS),

                Click.on(SELECTOR_STATE_ADDRESS),
                Enter.theValue(formData.get("State")).into(INPUT_STATE_ADDRESS),
                Hit.the(Keys.ENTER).into(INPUT_STATE_ADDRESS),

                Click.on(SELECTOR_CITY_ADDRESS),
                Enter.theValue(formData.get("City")).into(INPUT_CITY_ADDRESS),
                Hit.the(Keys.ENTER).into(INPUT_CITY_ADDRESS),

                Click.on(PracticeFormPage.BUTTON_SUBMIT).afterWaitingUntilEnabled());
    }

    public static PracticeFormTask fillOutStudentRegistrationFormWithUserData(Map<String, String> formData) {
        return instrumented(PracticeFormTask.class, formData);
    }
}


