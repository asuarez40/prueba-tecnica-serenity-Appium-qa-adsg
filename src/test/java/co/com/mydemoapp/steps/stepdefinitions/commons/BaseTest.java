package co.com.mydemoapp.steps.stepdefinitions.commons;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;

public class BaseTest {

    private WebDriver driver = Serenity.getDriver();

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(
                new OnlineCast());
    }

    @Given("que el usuario se encuentra dentro de MyDemoApp")
    public void queElUsuarioSeEncuentraDentroDeMyDemoApp() {
        OnStage.theActorCalled("nombreActor")
                .can(BrowseTheWeb.with(Serenity.getDriver())
                );
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
