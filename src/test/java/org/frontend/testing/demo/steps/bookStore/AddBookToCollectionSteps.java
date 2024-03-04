package org.frontend.testing.demo.steps.bookStore;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import org.frontend.testing.demo.tasks.bookStore.AddBookToCollectionTask;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.frontend.testing.demo.steps.hooks.Actors.COMMON_ACTOR;

public class AddBookToCollectionSteps {

    private static final Logger logger = LoggerFactory.getLogger(AddBookToCollectionSteps.class);

    @Cuando("ella realiza la búsqueda del libro {string}")
    public void searchSelectedBook(String book) {
        COMMON_ACTOR.attemptsTo(
                AddBookToCollectionTask.withTheName(book)
        );
    }

    @Entonces("podrá agregar el libro a la collección")
    public void addBookToCollection() {
        logger.error("No se puede agregar un libro a la colección dado que la página no carga");
    }
}
