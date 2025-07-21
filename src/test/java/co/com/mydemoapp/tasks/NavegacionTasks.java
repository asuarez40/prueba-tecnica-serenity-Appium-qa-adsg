package co.com.mydemoapp.tasks;

import co.com.mydemoapp.questions.TargetQuestion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import org.hamcrest.Matchers;

import static co.com.mydemoapp.ui.HomePageUi.BTN_LOGING;
import static co.com.mydemoapp.ui.HomePageUi.BTN_MENUACORDEON;
import static co.com.mydemoapp.ui.LoginPageUi.TEXTO_LOGIN;
import static co.com.mydemoapp.ui.LoginPageUi.TITULO_LOGUI;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class NavegacionTasks implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_MENUACORDEON),
                Click.on(BTN_LOGING)
        );
        actor.should(
                seeThat(TargetQuestion.title(TITULO_LOGUI), Matchers.containsString(TEXTO_LOGIN))
        );
    }

    public static NavegacionTasks navegar() {
        return new NavegacionTasks();
    }
}
