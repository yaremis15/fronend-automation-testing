package org.frontend.testing.demo.pages.forms;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PracticeFormPage {
    public static final Target INPUT_FIRST_NAME = Target.the("Field to enter First Name").located(By.cssSelector("#firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("Field to enter Last Name").located(By.cssSelector("#lastName"));
    public static final Target INPUT_USER_EMAIL = Target.the("Field to enter Email").located(By.cssSelector("#userEmail"));
    public static final Target RADIO_BUTTON_GENDER = Target.the("Select radio button gender").located(By.cssSelector("label[for='gender-radio-2']"));
    public static final Target INPUT_USER_MOBILE = Target.the("Field to enter Mobile").located(By.cssSelector("#userNumber"));
    public static final Target INPUT_DATE_OF_BIRTH = Target.the("Field to enter Date of Birth").located(By.cssSelector("#dateOfBirthInput"));
    public static final Target INPUT_AUTO_COMPLETE_SUBJECTS = Target.the("Field to autocomplete subjects").located(By.cssSelector("#subjectsInput"));
    public static final Target CHECKBOX_MUSIC_HOBBIES = Target.the("Select checkbox Music Hobbies").located(By.cssSelector("label[for='hobbies-checkbox-3']"));
    public static final Target INPUT_UPLOAD_PICTURE = Target.the("Field to load picture").located(By.cssSelector("#uploadPicture"));
    public static final Target INPUT_CURRENT_ADDRESS = Target.the("Field to write Current Address").located(By.cssSelector("#currentAddress"));
    public static final Target SELECTOR_STATE_ADDRESS = Target.the("Selector State Address").located(By.cssSelector("#state"));
    public static final Target INPUT_STATE_ADDRESS = Target.the("Field State Address").located(By.cssSelector("#react-select-3-input"));
    public static final Target SELECTOR_CITY_ADDRESS = Target.the("Selector City Address").located(By.cssSelector("#city"));
    public static final Target INPUT_CITY_ADDRESS = Target.the("Field City Address").located(By.cssSelector("#react-select-4-input"));
    public static final Target BUTTON_SUBMIT = Target.the("Submit Button").located(By.cssSelector("#submit"));

    //Completed form
    public static final Target LABEL_FORM_TITLE_COMPLETE = Target.the("The Title Form Complete").located(By.cssSelector("#example-modal-sizes-title-lg"));

    public static final Target BUTTON_CLOSE_MODAL_FORM = Target.the("Close Button").located(By.cssSelector("#closeLargeModal"));


}
