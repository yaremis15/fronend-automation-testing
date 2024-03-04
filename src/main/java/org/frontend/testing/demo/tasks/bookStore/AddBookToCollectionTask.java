package org.frontend.testing.demo.tasks.bookStore;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.frontend.testing.demo.interactions.WaitToLoad;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.frontend.testing.demo.pages.bookStore.BookStorePage.*;

public class AddBookToCollectionTask implements Task {
    private final String book;

    public AddBookToCollectionTask(String book) {
        this.book = book;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOOK_SEARCH_FIELD).afterWaitingUntilEnabled(),
                Enter.theValue(book).into(BOOK_SEARCH_FIELD),
                Click.on(BOOK_SEARCH_BUTTON).afterWaitingUntilEnabled(),
                Click.on(BOOK_FOUND_LINK).afterWaitingUntilEnabled(),
                WaitToLoad.theMiliSeconds(2000)
        );
    }

    public static AddBookToCollectionTask withTheName(String book) {
        return instrumented(AddBookToCollectionTask.class, book);
    }
}
