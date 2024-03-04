package org.frontend.testing.demo.pages.bookStore;

import net.serenitybdd.screenplay.targets.Target;

public class ProfilePage {
    public static final Target LABEL_USER_NAME = Target.the("Label with UserName name").locatedBy("#userName-value");
    public static final Target DELETE_ACCOUNT_BUTTON = Target.the("Delete Account Button").locatedBy(".text-center.button");
    public static final Target OK_BUTTON_TO_DELETE_ACCOUNT = Target.the("OK Button in modal to delete account").locatedBy("#closeSmallModal-ok");

}
