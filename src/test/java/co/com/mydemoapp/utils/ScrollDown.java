package co.com.mydemoapp.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import java.time.Duration;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ScrollDown implements Task {

    private final int times;

    public ScrollDown(int times) {
        this.times = times;
    }

    public static ScrollDown times(int times) {
        return instrumented(ScrollDown.class, times);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        AppiumDriver webDriver = (AppiumDriver) BrowseTheWeb.as(actor).getDriver();

        if (!(webDriver instanceof AppiumDriver)) {
            throw new IllegalArgumentException("El WebDriver no es una instancia de AppiumDriver");
        }

        AppiumDriver driver = (AppiumDriver) webDriver;

        int height = driver.manage().window().getSize().getHeight();
        int width = driver.manage().window().getSize().getWidth();

        int startY = (int) (height * 0.7);
        int endY = (int) (height * 0.3);
        int startX = width / 2;

        TouchAction<?> touchAction = new TouchAction<>((PerformsTouchActions) driver);

        for (int i = 0; i < times; i++) {
            touchAction
                    .press(PointOption.point(startX, startY))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                    .moveTo(PointOption.point(startX, endY))
                    .release()
                    .perform();
        }
    }
}
