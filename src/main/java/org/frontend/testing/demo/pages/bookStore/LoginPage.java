package org.frontend.testing.demo.pages.bookStore;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static final Target INPUT_USER_NAME = Target.the("Field to enter UserName").locatedBy("#userName");
    public static final Target INPUT_PASSWORD = Target.the("Field to enter Password").locatedBy("#password");
    public static final Target BUTTON_LOGIN = Target.the("Login Button").locatedBy("#login");
    public static final Target BUTTON_NEW_USER = Target.the("New User Button").locatedBy("#newUser");
    public static final Target LABEL_INVALID_LOGIN = Target.the("Label with message: 'Invalid username or password!'").locatedBy("#name");

}
