package co.com.mydemoapp.utils;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

public class ScrollToText implements Task {

    private final String text;

    public ScrollToText(String text) {
        this.text = text;
    }

    public static ScrollToText containing(String text) {
        return Tasks.instrumented(ScrollToText.class, text);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();

        AndroidDriver androidDriver = (AndroidDriver) ((net.thucydides.core.webdriver.WebDriverFacade) driver).getProxiedDriver();

        androidDriver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().textContains(\"" + text + "\"))"
        ));
    }

}
