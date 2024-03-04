package org.frontend.testing.demo.interactions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.markers.IsHidden;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.frontend.testing.demo.exceptions.GenericRuntimeException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SwitchToAlert implements Task, IsHidden {

    public SwitchToAlert() {
    }

    public static SwitchToAlert confirmation() {
        return instrumented(SwitchToAlert.class);
    }

    @Override
    @Step("{0} switch To alert")
    public <T extends Actor> void performAs(T actor) {

        try {
            WebDriver driver = BrowseTheWeb.as(actor).getDriver();

            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();

            System.out.println("Alert data: " + alertText);

            WaitToLoad.theMiliSeconds(2000);
            alert.accept();
        } catch (NoAlertPresentException e) {
            throw new GenericRuntimeException(e);
        }
    }
}