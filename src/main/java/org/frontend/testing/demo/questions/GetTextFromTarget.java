package org.frontend.testing.demo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GetTextFromTarget implements Question<String> {

    private static final Logger logger = LoggerFactory.getLogger(GetTextFromTarget.class);
    private final Target target;

    public GetTextFromTarget(Target target) {
        this.target = target;
    }

    public static Question<String> locatorTextIs(Target target) {
        return new GetTextFromTarget(target);
    }

    @Override
    public String answeredBy(Actor actor) {
        String textTarget = target.resolveFor(actor).getText();
        logger.info("The target locator text is: " + textTarget);

        return textTarget;
    }
}
