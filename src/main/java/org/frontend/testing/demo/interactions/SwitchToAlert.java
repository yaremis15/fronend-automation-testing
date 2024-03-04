package org.frontend.testing.demo.interactions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.frontend.testing.demo.exceptions.GenericRuntimeException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SwitchToAlert implements Task {

    private static final Logger logger = LoggerFactory.getLogger(SwitchToAlert.class);

    public SwitchToAlert() {
    }

    public static SwitchToAlert confirmation() {
        return instrumented(SwitchToAlert.class);
    }

    @Override
    @Step("{0} switch To alert and accept")
    public <T extends Actor> void performAs(T actor) {

        try {
            WebDriver driver = BrowseTheWeb.as(actor).getDriver();

            Alert alert = driver.switchTo().alert();
            WaitToLoad.theMiliSeconds(1000);

            logger.info("The alert message is: {}", alert.getText());

            alert.accept();
        } catch (NoAlertPresentException e) {
            throw new GenericRuntimeException(e);
        }
    }
}