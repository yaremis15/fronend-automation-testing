package org.frontend.testing.demo.pages.login;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static final Target INPUT_USER_NAME = Target.the("Field to enter UserName").locatedBy("#userName");
    public static final Target INPUT_PASSWORD = Target.the("Field to enter Password").locatedBy("#password");
    public static final Target BUTTON_LOGIN = Target.the("Login Button").locatedBy("#login");
    public static final Target BUTTON_NEW_USER = Target.the("New User Button").locatedBy("#newUser");

}
