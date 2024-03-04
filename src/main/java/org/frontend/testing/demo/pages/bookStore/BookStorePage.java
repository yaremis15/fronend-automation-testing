package org.frontend.testing.demo.pages.bookStore;

import net.serenitybdd.screenplay.targets.Target;

public class BookStorePage {

    public static final Target BOOK_SEARCH_FIELD = Target.the("Book search field").locatedBy("#searchBox");
    public static final Target BOOK_SEARCH_BUTTON = Target.the("Search button").locatedBy("#basic-addon2");
    public static final Target BOOK_FOUND_LINK = Target.the("Book Found Link").locatedBy(".action-buttons");

}
