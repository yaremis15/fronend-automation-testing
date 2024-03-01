package org.frontend.testing.demo.pages.forms;

import net.serenitybdd.screenplay.targets.Target;

public class PracticeFormPage {

    public static final Target INPUT_FIRST_NAME = Target.the("Field to enter First Name").locatedBy("#firstname");
    public static final Target INPUT_LAST_NAME = Target.the("Field to enter Last Name").locatedBy("#lastname");
    public static final Target INPUT_USER_EMAIL = Target.the("Field to enter Email").locatedBy("#userEmail");
    public static final Target RADIO_BUTTON_GENDER = Target.the("Select radio button Female").locatedBy("#gender-radio-2");
    public static final Target INPUT_USER_MOBILE = Target.the("Field to enter Mobile").locatedBy("#userNumber");
    public static final Target INPUT_DATE_OF_BIRTH = Target.the("Field to enter Date of Birth").locatedBy("#dateOfBirth-label");
    public static final Target INPUT_AUTO_COMPLETE_SUBJECTS = Target.the("Field to autocomplete subjects").locatedBy(".subjects-auto-complete__control.css-yk16xz-control");
    public static final Target CHECKBOX_MUSIC_HOBBIES = Target.the("Select checkbox Music Hobbies").locatedBy("#hobbies-checkbox-3");
    public static final Target INPUT_UPLOAD_PICTURE = Target.the("Field to load picture").locatedBy("#uploadPicture");
    public static final Target INPUT_CURRENT_ADDRESS = Target.the("Field to write Current Address").locatedBy("#currentAddress");
    public static final Target SELECTOR_STATE_ADDRESS = Target.the("Selector State Address").locatedBy("#state");
    public static final Target SELECTOR_CITY_ADDRESS = Target.the("Selector City Address").locatedBy("#city");
    public static final Target BUTTON_SUBMIT = Target.the("Submit Button").locatedBy("#submit");
}
