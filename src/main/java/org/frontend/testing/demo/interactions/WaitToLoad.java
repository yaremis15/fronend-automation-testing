package org.frontend.testing.demo.interactions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.markers.IsHidden;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.annotations.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Subject("{0} waits for '#seconds' milliseconds")
public class WaitToLoad implements Interaction, IsHidden {

    private static final Logger logger = LoggerFactory.getLogger(WaitToLoad.class);

    private final int milliseconds;

    public WaitToLoad(int milliseconds) {
        this.milliseconds = milliseconds;
    }

    public static WaitToLoad theMiliSeconds(int milliseconds) {
        return Tasks.instrumented(WaitToLoad.class, milliseconds);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            logger.error("Error '{}' to Wait", e.getMessage());
            Thread.currentThread().interrupt();
        }
    }
}