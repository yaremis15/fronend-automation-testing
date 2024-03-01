package org.frontend.testing.demo.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(publish = true,
        features = {"src/test/resources/features.demo"},
        glue = {"org.fronend.testing.reto.steps.hooks"},
        tags = "@navigateToPageHome",
        snippets = CAMELCASE)

public class TestSuiteRunner {

}
