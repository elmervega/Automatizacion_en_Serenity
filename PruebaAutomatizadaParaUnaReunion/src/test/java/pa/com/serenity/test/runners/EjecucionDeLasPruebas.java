package pa.com.serenity.test.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/historia_de_la_reunion.feature",
        tags = "@Historia",
        glue = "pa.com.serenity.test.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class EjecucionDeLasPruebas {
}
