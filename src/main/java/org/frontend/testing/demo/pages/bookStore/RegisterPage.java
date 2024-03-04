package org.frontend.testing.demo.pages.bookStore;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage {
    public static final Target INPUT_FIRST_NAME = Target.the("Field to enter First Name").locatedBy("#firstname");
    public static final Target INPUT_LAST_NAME = Target.the("Field to enter Last Name").locatedBy("#lastname");
    public static final Target INPUT_USER_NAME = Target.the("Field to enter UserName").locatedBy("#userName");
    public static final Target INPUT_PASSWORD = Target.the("Field to enter Password").locatedBy("#password");
    public static final Target CHECK_BUTTON_RECAPTCHA = Target.the("Recaptcha Check Button").locatedBy("#g-recaptcha");
    public static final Target BUTTON_REGISTER = Target.the("Register Button").locatedBy("#register");

}
