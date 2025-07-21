package co.com.mydemoapp.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "co.com.mydemoapp.steps",
        plugin = {"json:target/destination/cucumber.json", "rerun:target/destination/failedrerun.txt",
                "html:target/destination/cucumber.html", "timeline:target/test-results/timeline"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@IncioSesionExitoso"
)
public class CucumberTestSuite {
}
